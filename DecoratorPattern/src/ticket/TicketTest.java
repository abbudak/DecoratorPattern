package ticket;

public class TicketTest {
	public static void main(String[] args) {
		Ticket breakfast = new Breakfast(new BasicTicket());
		breakfast.cost();
		System.out.println("\n*****");
		
		Ticket lunch = new Breakfast(new Lunch(new BasicTicket()));
		lunch.cost();
	}
}
