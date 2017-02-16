package pattern.observer.my;

public class ObserverPatternTestAPI {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.attach(new BinaryObserver(subject));
		subject.attach(new OctalObserver(subject));
		subject.attach(new HexaObserver(subject));
		subject.setState(2);
		//change state to 3
		subject.setState(3);
	}
}
