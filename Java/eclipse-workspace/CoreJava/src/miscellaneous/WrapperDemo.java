package miscellaneous;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :10:51:13 AM
 * project  :CoreJava
*/

public class WrapperDemo {

	public static void main(String[] args) {
		
		// create primitive types
				
				int a=5;
				float b=10.10f;
				
				// convert in to wrapper objects
				Integer aObj=a;  // Auto boxing - Convert value type to Object type
				Float  bObj=b;
				
				// create wrapper class Object
				Integer x=Integer.valueOf(100); // int x=100;
				Double y=Double.valueOf(20000.00); // double y=20000.00;
				
				// convert into primitive types
				int p=x.intValue();   // Auto Unboxing --converting Obj to value type
				double q=y.doubleValue();
				
				System.out.println(p +" "+q);
				System.out.println(aObj + " "+bObj);
				
				char e='a';
				Character objE=e;  // boxing
				System.out.println(objE);
				System.out.println(Character.isUpperCase(e));
				
				Double d=200.5;
				Double objD=Double.valueOf(d);
				System.out.println(objD);
				System.out.println(Double.toHexString(d));
				System.out.println(Integer.toHexString(15));
				
				String hex="0xff";
				String oct=	"005";
				
				System.out.println(Integer.decode(hex));
				System.out.println(Integer.decode(oct));
	}
}
