package cinema.entities;

public class ReturnedTicket {

    private Ticket returned_ticket;

    public ReturnedTicket() {
    }

    public ReturnedTicket(Ticket returned_ticket) {
        this.returned_ticket = returned_ticket;
    }

    public Ticket getReturned_ticket() {
        return returned_ticket;
    }

    public void setReturned_ticket(Ticket returned_ticket) {
        this.returned_ticket = returned_ticket;
    }
}
