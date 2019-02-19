package ticket;

public class TicketDecorator implements Ticket {
	protected Ticket ticket;
	
	public TicketDecorator(Ticket t) {
		this.ticket = t;
	}

	@Override
	public void cost() {
		this.ticket.cost();
	}

}
