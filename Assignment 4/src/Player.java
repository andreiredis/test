
public class Player {
	
	private static int player;
	
	static int getPlayer() {
		return player;
	}
	
	void setPlayer(int p) {
		player = p;
	}
	
	void change () {
		if (player == 1) {
			player = 2;
		} else {
			player = 1;
		}
	}
	
}
