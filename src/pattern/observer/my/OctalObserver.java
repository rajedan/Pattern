package pattern.observer.my;

public class OctalObserver extends Observer{

	public OctalObserver(Subject pSubject) {
		this.subject = pSubject;
	}
	
	@Override
	public void update() {
		System.out.println("Octal String of "+this.subject.getState()+" is : "+Integer.toOctalString(this.subject.getState()));
	}

}
