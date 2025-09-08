package collectionsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :4:46:43 PM
 * project  :CoreJava
*/

public class Container <T>{
	
	private T t;
	
	//method
	public void add(T t) {
		this.t = t;
	}
	
	//generate getter
	public T get() {
		return t;
	}

	public static void main(String[] args) {

		Container<String> strContainer=new Container<String>();
		Container<Integer> intContainer=new Container<Integer>();
		Container<Double> dblContainer=new Container<Double>();
		Container<Character> chrContainer=new Container<Character>();
		
		strContainer.add("James Gosling");
		intContainer.add(1000);
		dblContainer.add(50000.55);
		chrContainer.add('A');
		
		System.out.println("The String Value is :"+strContainer.get());
		System.out.println("The Integer Value is :"+intContainer.get());
		System.out.println("The Double Value is :"+dblContainer.get());
		System.out.println("The Character Value is :"+chrContainer.get());

	}

}
