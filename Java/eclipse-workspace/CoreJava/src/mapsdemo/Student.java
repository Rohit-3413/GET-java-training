package mapsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :4:12:21 PM
 * project  :CoreJava
 */

// Java Comparable Interface is used to order the objects of user-defined class.
// It provide single sorting sequence only

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student st) {

		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}


}
