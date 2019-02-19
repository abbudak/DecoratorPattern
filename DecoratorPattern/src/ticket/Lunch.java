package ticket;

public class Lunch extends TicketDecorator {

	public Lunch(Ticket t) {
		super(t);
	}

	@Override
	public void cost() {
		super.cost();
		System.out.print(", adding food to ticket price");
	}
}
