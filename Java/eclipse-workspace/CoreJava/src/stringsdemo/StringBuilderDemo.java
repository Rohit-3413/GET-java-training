package stringsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :1:03:54 PM
 * project  :CoreJava
*/

public class StringBuilderDemo {

	public static void main(String[] args) {

		 String s1="rock";
	        String s2=s1.replace('r', 'd');
	        System.out.println("The Original String : "+s1+
	                " The modified String "+s2);

	        StringBuilder sb=new StringBuilder("rock"); // Better performance & Speed - Not Thread Safe
	        sb.replace(0, 1, "d");
	        System.out.println("The Modified String :"+sb);

	        String s3="There is a red fox in the forest";
	        StringBuilder sb1=new StringBuilder(s3);

	        sb1.insert(19,"and a wolf ");
	        System.out.println(sb1);

	        sb1.append(" of Western Ghats");
	        System.out.println(sb1);

	        int pos=sb1.indexOf("wolf");
	        System.out.println("The position of wolf in s3 is : "+pos);

	        int i=sb1.indexOf("wolf");
	        int j="wolf".length();
	        sb1.replace(i, i+j, "dog");
	        System.out.println("The sb after replacing :"+sb1);

	        String s4=sb1.substring(10,28);
	        System.out.println("The Sub String of sb1: "+s4);

	        System.out.println(sb1.reverse());

	}

}
