package pattern.observer.my;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject pSubject) {
		this.subject = pSubject;
	}
	
	@Override
	public void update() {
		System.out.println("Binary String of "+this.subject.getState()+" is : "+Integer.toBinaryString(this.subject.getState()));
	}

}
