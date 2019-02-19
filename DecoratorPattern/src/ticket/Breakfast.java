package ticket;

public class Breakfast extends TicketDecorator {

	public Breakfast(Ticket t) {
		super(t);
	}

	@Override
	public void cost() {
		super.cost();
		System.out.print(", adding breakfast to ticket price");
	}
}
