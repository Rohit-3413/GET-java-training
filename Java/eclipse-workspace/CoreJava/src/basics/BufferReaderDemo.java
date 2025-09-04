package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Aug 30, 2025
 * Time     :10:35:30 AM
 * project  :CoreJava
 */

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("Enter your Name ");
		String name = br.readLine();
		System.out.println("Enter your Age ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter your Salary ");
		float salary = Integer.parseInt(br.readLine());

		System.out.println("Welcome "+name+", your Age is: "+age+", your salary is "+salary);
	}

}
