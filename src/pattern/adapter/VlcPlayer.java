package pattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing: "+fileName+".vlc");
	}

	@Override
	public void playMp4(String fileName) {
		throw new RuntimeException("Does not support "+fileName+" in Vlc Player");
	}
	
}
