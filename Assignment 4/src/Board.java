public class Board {
	public int[][] m = {   { 0, 1, 0, 1, 0, 1, 0, 1 },
			 			   { 1, 0, 1, 0, 1, 0, 1, 0 },
			 			   { 0, 1, 0, 1, 0, 1, 0, 1 },
			 			   { 0, 0, 0, 0, 0, 0, 0, 0 },
			 			   { 0, 0, 0, 0, 0, 0, 0, 0 },
			 			   { 2, 0, 2, 0, 2, 0, 2, 0 },
			 			   { 0, 2, 0, 2, 0, 2, 0, 2 },
			 			   { 2, 0, 2, 0, 2, 0, 2, 0 }
	};
	
	
	int pno = Player.getPlayer();
	
	public static int[] X = new int[3];
	public static int[] Y = new int[3];
	public static int[] mX = new int[3];
	public static int[] mY = new int[3];

	
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
