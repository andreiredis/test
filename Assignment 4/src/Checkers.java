import java.util.Scanner;

public class Checkers {
	public Scanner s = new Scanner(System.in);
	
	public int[] X = new int[3];
	public int[] Y = new int[3];
	public int[] mX = new int[3];
	public int[] mY = new int[3];
	
	public int[] getX() {
		return X;
	}

	public int[] getY() {
		return Y;
	}

	public int[] getmX() {
		return mX;
	}

	public int[] getmY() {
		return mY;
	}

	public static void tabHeader() {
		System.out.print("   0 1 2 3 4 5 6 7   <- X axis\n");
		System.out.print("  +----------------+\n");
	}
	
	public static void tabFooter() {
		System.out.print("  +----------------+\n");
		System.out.print("   0 1 2 3 4 5 6 7  \n");
	}
	
	public static void printTab(int[][] m) {
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
	}
	
	public static void main(String[] args) {
		
		Board b = new Board();
		Player p = new Player();
		p.setPlayer(2);
		int pno = Player.getPlayer();
		
		while(true) {
			
			tabHeader();
			printTab(b.m);
			tabFooter();
			p.change();
			
			System.out.print("\nTurn of Player no. " + pno + "\n");
			
			
		}
		
	}
	
}
