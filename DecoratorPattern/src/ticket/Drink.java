package ticket;

public class Drink extends TicketDecorator {

	public Drink(Ticket t) {
		super(t);
	}

	@Override
	public void cost() {
		super.cost();
		System.out.print(", adding drink to ticket price");
	}
}
