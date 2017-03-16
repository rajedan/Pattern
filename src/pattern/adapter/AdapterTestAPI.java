package pattern.adapter;

public class AdapterTestAPI {
	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();
		player.play("mp3","mera man");
		player.play("mp4","mera man");
		player.play("vlc","mera man");
	}
}