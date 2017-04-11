
public class Producer extends Thread {
	Tickets tickets = null;

	public Producer(Tickets tickets) {
		this.tickets = tickets;
	}

	@Override
	public void run() {
		while (tickets.number < tickets.size) {
			System.out.println("Producer puts ticket " + (++tickets.number));
			tickets.available = true;
		}
	}
}
