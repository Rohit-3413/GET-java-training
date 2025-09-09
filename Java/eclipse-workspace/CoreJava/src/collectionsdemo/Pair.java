package collectionsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :9:24:49 AM
 * project  :CoreJava
*/

public class Pair<T,U> {
	
	private T first;
	private U second;
	
	//Default constructor
	public Pair() {
		this.first = null;
		this.second = null;
	}
	
	//Generic constructor
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
		
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}
	
	
}

