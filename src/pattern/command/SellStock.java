package pattern.command;

public class SellStock implements Order{
	
	Stock myStock;
	
	public SellStock(Stock stock) {
		myStock = stock;
	}
	
	@Override
	public void execute() {
		myStock.sell();
	}
}
