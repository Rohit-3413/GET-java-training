package mapsdemo;

import java.util.Comparator;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :4:34:00 PM
 * project  :CoreJava
 */

public class Developer {

	int id;
	String name,domain;

	public Developer(int id, String name, String domain) {
		this.id = id;
		this.name = name;
		this.domain = domain;
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}

}

/**Comparator interface is used to order the objects of user-defined classes.
* This interface is found in java.util package and contains two methods.
* 1. int compare(Object obj1, Object obj2) : This method is used to compare the two objects.
* It returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
* 2. boolean equals(Object element) : This method is used to check whether the passed object is equal to the object or not.
* 
* Note: It is not mandatory to override this method.
* */

class IdComparator implements Comparator<Developer>
{

	@Override
	public int compare(Developer o1, Developer o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;

		if(d1.id==d2.id)
			return 0;
		else if (d1.id>d2.id)
			return 1;
		else
			return -1;
	}

}


class DomainComparator implements Comparator<Developer>
{
	@Override
	public int compare(Developer o1, Developer o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;

		return d1.domain.compareTo(d2.domain); // compare Strings
	}

}