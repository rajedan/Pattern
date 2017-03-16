package pattern.command;

public class Stock {
	String name;
	int quantity;
	
	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public void buy() {
		System.out.println("Bought!");
	}
	
	public void sell() {
		System.out.println("Sold!");
	}
}
