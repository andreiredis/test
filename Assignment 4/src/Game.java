import java.util.Scanner;

public class Game {
	public int[][] m = {   { 0, 1, 0, 1, 0, 1, 0, 1 },
						   { 1, 0, 1, 0, 1, 0, 1, 0 },
						   { 0, 1, 0, 1, 0, 1, 0, 1 },
						   { 0, 0, 0, 0, 0, 0, 0, 0 },
						   { 0, 0, 0, 0, 0, 0, 0, 0 },
						   { 2, 0, 2, 0, 2, 0, 2, 0 },
						   { 0, 2, 0, 2, 0, 2, 0, 2 },
						   { 2, 0, 2, 0, 2, 0, 2, 0 }};
	
	Player p1;
	Player p2;
	Player currentPlayer;
	
	int pno = currentPlayer.getPlayer();

	int x1, y1, x2, y2; 
	
	public Game (Player p1, Player p2) {
		this.p1 = p1;
		this.p1 = p2;
			
	}
	
	private void drawGame (int[][] m) {
		System.out.print("   0 1 2 3 4 5 6 7   <- X axis\n");
		System.out.print("  +----------------+\n");
		
		for(int i = 0; i < 8; i++) {
			// go through each matrix row
			System.out.print(i + " |");
			
			// go through each cell (column with fixed row)
			for(int j = 0; j < 8; j++) {
				if (m[i][j] == 1 || m[i][j] == 2) { 
					System.out.print(Integer.toString(m[i][j])); 
				} else {
					System.out.print(" ");
				}
				
				System.out.print(" ");
			}
			
			System.out.print("|\n");
		}
		
		System.out.print("  +----------------+\n");
		System.out.print("   0 1 2 3 4 5 6 7  \n");
	}
	
	
	
	private boolean belongs(int x1, int y1, int[][] m, int pno) {
		if (m[x1][y1] == pno) { 
			return true;
		} else {
			System.out.print("\nNo piece on the position that belongs to you! \n");
			return false;
		}
	}
	
	private boolean isCorrect (int x1, int y1, int x2, int y2, int[][] m, int pno) {
		if (pno == 1) {
			if ( (x2 > x1 && y2 > y1) || (x2 > x1 && y2 < y1) || (x2 == x1 && y2 == y1) ) {
				return true;
			} 	
		} else if (pno == 2) {
			if ( (x2 < x1 && y2 < y1) || (x2 < x1 && y2 > y1) || (x2 == x1 && y2 == y1) ){
				return true;
			}
		} 
		return false;
	}
	
	public void setPlayer (Player p) {
		currentPlayer = p;
	}
	
	public void changePlayer () {
		if (currentPlayer.equals(p1)) {
			currentPlayer = p2;
		} else {
			currentPlayer = p1;
		}
	}
	
	public void move(int x1, int y1, int x2, int y2) {
		// Delete current piece position
		m[x1][y1] = 0;
		
		// Create on new position
		m[x2][y2] = pno;
	}	
	
	public void playerMove() {
		Scanner s = new Scanner(System.in);
		
		// PIECE SELECTION
		System.out.print("Coordinate of piece to move\n");
		while (true) {
			System.out.print("  Enter Y: ");
			String X = s.next();
			System.out.print("  Enter X: ");
			String Y = s.next();
			x1 = Integer.parseInt(X);
			y1 = Integer.parseInt(Y);
			
			if (belongs(x1,y1,m,pno)) {break;}
			
			System.out.print("\nNo piece that belongs to you on position! \n");
		}
		
		// MOVING THE PIECE
		System.out.print("Coordinate of new position\n");
		while (true) {
			System.out.print("  Enter Y: ");
			String X = s.next();
			System.out.print("  Enter X: ");
			String Y = s.next();
			x2 = Integer.parseInt(X);
			y2 = Integer.parseInt(Y);
			
			// Check if there is a piece on position
			if (m[x2][y2] != 0) {
				System.out.print("\nCan't move on top of another piece \n");
				continue;
			}
			
			if (isCorrect (x1, y1, x2, y2, m, pno)) {break;}
			
			move(x1,x2,y1,y2);
		}
		
	}
	
	public void startGame () {
		
		setPlayer(p1);
		
		while(true) {
			
			drawGame(m);
			playerMove();
			changePlayer();
				
		}
	}
}