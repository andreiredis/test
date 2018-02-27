public class Checkers {
	
	public static void main(String[] args) {
		
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player cp = p1;
		
		Game g = new Game(p1, p2, cp);
		g.setPlayer(p1);
		g.startGame();	
	}
	
}
