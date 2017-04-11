
public class Consumer extends Thread {
	Tickets tickets = null;
	int i = 0;

	public Consumer(Tickets tickets) {
		this.tickets = tickets;
	}

	@Override
	public void run() {
		while(i<tickets.size){
			if (tickets.available == true && i < tickets.number) {
				System.out.println("Consumer buys ticket " + (++i));
			}
			if (i == tickets.number) {
				tickets.available = false;
			}
		}
	}
}
