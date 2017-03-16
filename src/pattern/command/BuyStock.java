package pattern.command;

public class BuyStock implements Order{
	
	Stock myStock;
	
	public BuyStock(Stock stock) {
		myStock = stock;
	}
	
	@Override
	public void execute() {
		myStock.buy();
	}
}
