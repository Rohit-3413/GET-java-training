package miscellaneous;

import java.util.ArrayList;
import java.util.List;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :11:44:04 AM
 * project  :AdvanceJava
 * 
 * In Java 5, The covariant return types are newly introduced. 
 * After introduced the covariant return type, Java allows us to change the return type 
 * of the overriding method(Method in child class). 
 * But the return type of overriding method (Method of child class) 
 * must be a subtype of the overridden method (Method of Parent class). 
 * If you try to provide the return type of overriding method(Method of child class) 
 * with supertype, then it with throw exception at compile time.
 * 
 * The Covariant method overriding provides a way that you can return the subtype of 
 * actually return type of overridden method. 
 * It helps the programmer to remove the burden of type casting. 
 * This method is mostly used when the overriding method returns an object.
*/

public class Student {
	
	public List<String> listOfName()
    {
        ArrayList<String> listOfName = new ArrayList<>();
        listOfName.add("John");
        listOfName.add("Ram");
        listOfName.add("Mary");
        
        return listOfName;
    }
}

class Record extends Student {

	// covariant return type - subtype of supertype
	@Override
	public ArrayList<String> listOfName() {
		 
	    ArrayList<String> listOfName = new ArrayList<String>();
	        listOfName.add("Java");
	        listOfName.add("Gosling");
	        listOfName.add("Covariant");
	    
	        return listOfName;
	}
	
	 
//     This will cause a compilation error because String is not a subtype of List<String>
//public String listOfName() {
//    return "Invalid Return Type";
//}
//	
	
}