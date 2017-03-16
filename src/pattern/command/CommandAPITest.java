package pattern.command;

public class CommandAPITest {
	public static void main(String[] args) {
		Stock myStock = new Stock("s1", 12);
		Order o = new BuyStock(myStock);
		
		Order o2 = new SellStock(myStock);
		
		
		Broker broker = new Broker();
		broker.takeOrder(o);
		broker.takeOrder(o2);
		broker.placeOrder();
	}
}
