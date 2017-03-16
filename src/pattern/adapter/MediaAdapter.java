package pattern.adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer myPlayer;
	
	public MediaAdapter(String fileType) {
		if(fileType.equalsIgnoreCase("mp4")){
			myPlayer = new Mp4Player();
		} else if(fileType.equalsIgnoreCase("vlc")){
			myPlayer = new VlcPlayer();
		}
	}
	
	@Override
	public void play(String fileType, String fileName) {
		if(fileType.equalsIgnoreCase("vlc")){
			myPlayer.playVlc(fileName);
		} else if(fileType.equalsIgnoreCase("mp4")){
			myPlayer.playMp4(fileName);
		}
	}
	
}
