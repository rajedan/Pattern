package pattern.observer.my;

public abstract class Observer {
	/**
	 * The subject to be observed
	 */
	protected Subject subject;
	
	/**
	 * Update the state of observers
	 */
	public abstract void update();
}
