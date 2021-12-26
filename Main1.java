
public class Main1 extends Player{

	public static void main(String[] args) {
		
		
		Main1 main = new Main1();
		main.play("Skinny Brown - Fix you");
		main.pause();
		main.stop();
	}
	
	 
	
	@Override
	void play(String songName) {
		System.out.println(songName + " play the song.");
	}

	@Override
	void pause() {
		System.out.println("Pause.");
		
	}

	@Override
	void stop() {
		System.out.println("Stop.");
		
	}

}
