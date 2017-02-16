package pattern.observer.my;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	/**
	 * State
	 */
	private int state;
	
	/**
	 * The Observer list of this class
	 */
	private List<Observer> observers = new ArrayList<>();
	
	/**
	 * Getter of state
	 * @return
	 */
	public int getState() {
		return state;
	}
	
	/**
	 * Setter of state
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	/**
	 * Attach an observer to this class
	 * @param pObserver
	 */
	public void attach(Observer pObserver) {
		observers.add(pObserver);
	}
	
	public void notifyAllObservers() {
		for(Observer observer : observers){
			observer.update();
		}
	}
}