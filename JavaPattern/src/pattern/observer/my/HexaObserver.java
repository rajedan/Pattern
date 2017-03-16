package pattern.observer.my;

public class HexaObserver extends Observer{

	public HexaObserver(Subject pSubject) {
		this.subject = pSubject;
	}
	
	@Override
	public void update() {
		System.out.println("Hexa String of "+this.subject.getState()+" is : "+Integer.toHexString(this.subject.getState()));
	}

}
