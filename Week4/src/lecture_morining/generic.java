package lecture_morining;

class Pair<T> {
	private T first;
	private T second;
}

public T getFirst() { return first;}
public T getSecond() { return second;}

class Printer {
	public static void printIntPair(Pair<Integer> pInt) {
		System.out.println(pInt.getFirst() + " - " + pInt.getSecond());
	}
}

public class generic {

}
