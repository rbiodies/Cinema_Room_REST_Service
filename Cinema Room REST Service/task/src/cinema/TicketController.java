package cinema;

import cinema.entities.ReturnedTicket;
import cinema.entities.Stats;
import cinema.entities.Ticket;
import cinema.entities.Token;
import cinema.exceptions.BusinessException;
import cinema.exceptions.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {
    List<Ticket> available_seats = new ArrayList<>();
    List<Token> available_token = new ArrayList<>();

    @Autowired
    TicketService stats;

    public TicketController() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                available_seats.add(new Ticket(i + 1, j + 1));
            }
        }
    }

    @GetMapping("/seats")
    public JsonUtils getTickets() {
        return new JsonUtils(9, 9, available_seats);
    }

    @PostMapping("/purchase")
    public Token ticketStatus(@RequestBody Ticket ticket) throws BusinessException {
        if (ticket.getRow() < 1 || ticket.getRow() > 9 || ticket.getColumn() < 1 || ticket.getColumn() > 9) {
            throw new BusinessException("The number of a row or a column is out of bounds!");
        }
        for (Ticket ticketWithPrice : available_seats) {
            if (ticketWithPrice.getColumn() == ticket.getColumn() && ticketWithPrice.getRow() == ticket.getRow()) {
                available_token.add(new Token(ticketWithPrice));
                available_seats.remove(ticketWithPrice);

                stats.generateTicket(ticketWithPrice);

                return available_token.get(available_token.size() - 1);
            }
        }
        throw new BusinessException("The ticket has been already purchased!");
    }

    @PostMapping("/return")
    public ReturnedTicket tokenStatus(@RequestBody Token token) throws BusinessException {
        for (Token tokenAndTicket : available_token) {
            if (tokenAndTicket.getToken().equals(token.getToken())) {
                available_seats.add(tokenAndTicket.getTicket());
                available_token.remove(tokenAndTicket);

                stats.returnTicket(tokenAndTicket);

                return new ReturnedTicket(tokenAndTicket.getTicket());
            }
        }
        throw new BusinessException("Wrong token!");
    }

    @PostMapping("/stats")
    public Stats stats(@RequestParam(required = false) String password) throws CustomException {
        return stats.getStats(password);
    }
}

