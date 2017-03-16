package pattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing: "+fileName+".mp4");
	}
	
	@Override
	public void playVlc(String fileName) {
		throw new RuntimeException("Does not support "+fileName+" in Mp4 Player");
	}
}
