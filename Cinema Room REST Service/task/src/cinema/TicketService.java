package cinema;

import cinema.entities.Stats;
import cinema.entities.Ticket;
import cinema.entities.Token;
import cinema.exceptions.CustomException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TicketService {
    Stats stats = new Stats(
            0,
            81,
            0
    );

    public void generateTicket(Ticket ticketWithPrice) {
        stats.setCurrent_income(stats.getCurrent_income() + ticketWithPrice.getPrice());
        stats.setNumber_of_available_seats(stats.getNumber_of_available_seats() - 1);
        stats.setNumber_of_purchased_tickets(stats.getNumber_of_purchased_tickets() + 1);
    }

    public void returnTicket(Token tokenAndTicket) {
        stats.setCurrent_income(stats.getCurrent_income() - tokenAndTicket.getTicket().getPrice());
        stats.setNumber_of_available_seats(stats.getNumber_of_available_seats() + 1);
        stats.setNumber_of_purchased_tickets(stats.getNumber_of_purchased_tickets() - 1);
    }

    public Stats getStats(String password) throws CustomException {
        if (Objects.equals(password, "super_secret")) {
            return stats;
        }
        throw new CustomException("The password is wrong!");
    }
}
