package packagedemo;

import com.coforge.training.microsoftrpoj.OperatingSystem;
import com.coforge.training.oracleproj.Database;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :10:37:06 AM
 * project  :CoreJava
 * 
 * Program to demonstrate import & usage of user-defined Packages
*/

public class SoftwareList {

	public static void main(String[] args) {

		OperatingSystem op1 = new OperatingSystem();
		Database db1 = new Database();
		
		System.out.println("*************** List of Operating System from Microsoft **************");
		op1.listSoftware();  // Invoke method from other user defined package
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("*************** List of Databases from Oracle *************************");
		db1.printSoftware();

	}

}
