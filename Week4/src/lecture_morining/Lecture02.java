package lecture_morining;

public class Lecture02 {

	public static void main(String[] args) {
		
		String[] s = new String[] {"test1", "test2", "test3"};
		
		for(int i=0; i<5; i++) {
			try {
				String myString = s[i];
				System.out.println(myString);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error!");
			} finally {
				System.out.println("I am always executed");
			}
		
		}
	}

}
