package exercises_morning;

	

public class E1 <Generic> {

	public Generic first;
	public Generic second;
	public Generic third;
	
	public Generic getFirst() {return first;}
	public Generic getSecond() {return second;}
	public Generic getThird() {return third;}
	
	E1 (Generic first, Generic second, Generic third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E1<Integer> o = new E1<Integer>(1,2,3);
		
		
	}

}
