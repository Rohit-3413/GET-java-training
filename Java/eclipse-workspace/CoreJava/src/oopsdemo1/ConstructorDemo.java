package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :11:49:09 AM
 * project  :CoreJava
 * 
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object properties.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance/object of a given class is created.
*/

public class ConstructorDemo {

	
		 int id;
			String name;
			float salary;
			

			public ConstructorDemo() {
				System.out.println("I am Implicit Constructor");
				id=101;
				name="Mike";
				salary=5000.00f;
			}
			
			
			 // generate Constructor with arguments
			// Source Menu -> Generate Constructor using Fields
			// --> Select All --> Generate Button
		public ConstructorDemo(int id, String name, float salary) {
			System.out.println("I am Parameterized Constructor");
				this.id = id;
				this.name = name;
				this.salary = salary;
			}

		void display()
		{
			System.out.println(this.id+ " "+this.name+ " "+ this.salary);
		}


		public static void main(String[] args) {
				 
			ConstructorDemo cd1 = new ConstructorDemo(); // Invokes implicit Constructor
			ConstructorDemo cd2 = new ConstructorDemo(102,"John",6000.00f); // Invoke parameterized constructor
			ConstructorDemo cd3 = new ConstructorDemo(103,"Gavin",5000.00f); // Invoke parameterized constructor
			
			ConstructorDemo cd4 = new ConstructorDemo();
			ConstructorDemo cd5 = new ConstructorDemo();
			
			cd1.display();
			cd2.display();
			cd3.display();
			
			ConstructorDemo cd6 = new ConstructorDemo();
			
	}


}
