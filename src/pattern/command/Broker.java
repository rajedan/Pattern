package pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	List<Order> alList = new ArrayList<>();
	
	public void takeOrder(Order order) {
		alList.add(order);
	}
	
	public void placeOrder() {
		for(Order o : alList){
			o.execute();
		}
		alList.clear();
	}
}
