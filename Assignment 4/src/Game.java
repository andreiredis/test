public class Game {
	
	Player p1;
	Player p2;
	Player currentPlayer;
	
	public int[][] m = {   { 0, 1, 0, 1, 0, 1, 0, 1 },
						   { 1, 0, 1, 0, 1, 0, 1, 0 },
						   { 0, 1, 0, 1, 0, 1, 0, 1 },
						   { 0, 0, 0, 0, 0, 0, 0, 0 },
						   { 0, 0, 0, 0, 0, 0, 0, 0 },
						   { 2, 0, 2, 0, 2, 0, 2, 0 },
						   { 0, 2, 0, 2, 0, 2, 0, 2 },
						   { 2, 0, 2, 0, 2, 0, 2, 0 }
	};
	
	public static int[] X = new int[3];
	public static int[] Y = new int[3];
	public static int[] mX = new int[3];
	public static int[] mY = new int[3];
	
	
	public Game (Player p1, Player p2) {
		this.p1 = p1;
		this.p1 = p2;
			
	}
	
	public static void drawGame {
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
	

	
	private boolean belongs(int[] X, int[] Y, int[] m, int pno) {
		if (m[X[pno]][Y[pno]] == pno) { 
			return true;
		} else {
			System.out.print("\nNo piece on the position that belongs to you! \n");
			return false;
		}
	}
	
	private boolean isCorrect () {
		if (pno == 1) {
			if (mX[pno] > X[pno] && mY[pno] > Y[pno]) {
				
			} else if (mX[pno] > X[pno] && mY[pno] < Y[pno]) {
				
			} else if (mX[pno] == X[pno] && mY[pno] == Y[pno]) {
				
			} else {
				System.out.print("Invalid move " + pno + "\n");
				continue;
			}
				
		} else if (pno == 2) {
			if (mX[pno] < X[pno] && mY[pno] < Y[pno]) {
				
			} else if (mX[pno] < X[pno] && mY[pno] > Y[pno]) {
			
			} else if (mX[pno] == X[pno] && mY[pno] == Y[pno]) {
				
			} else {
				System.out.print("\nInvalid move" + pno +"\n");
				continue;
			}
		}
	}
	
	public boolean move(int X,int Y) {
		
		// Delete current piece position
		m[X[pno]][Y[pno]] = 0;
		
		// Create on new position
		m[mX[pno]][mY[pno]] = pno;
		
		return true;
	}	
}
