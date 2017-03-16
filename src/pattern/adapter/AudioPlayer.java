package pattern.adapter;

public class AudioPlayer implements MediaPlayer{
	
	MediaPlayer player;
	
	@Override
	public void play(String fileType, String fileName) {
		if(fileType.equalsIgnoreCase("mp3")){
			System.out.println("Playing: "+fileName+".mp3");
			return;
		}
		player = new MediaAdapter(fileType);
		player.play(fileType, fileName);
	}

}
