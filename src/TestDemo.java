
public class TestDemo {
	public static void main(String[] args) {
		Tickets tickets = new Tickets(10);
		new Producer(tickets).start();
		new Consumer(tickets).start();
	}
}
