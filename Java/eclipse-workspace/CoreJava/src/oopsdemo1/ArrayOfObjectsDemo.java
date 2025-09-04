package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :10:52:42 AM
 * project  :CoreJava
*/

class Faculty
{
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}


public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		// Create array of Faculty Object
		Faculty[] obj = new Faculty[5];
		
		// Initialize Faculty Object
		for(int i=0; i<5; i++) {
			obj[i] = new Faculty();
		}
		
		// assign data to Faculty Objects
		obj[0].setData(100,"James");
		obj[1].setData(101,"Gavin");
		obj[2].setData(102,"Navin");
		obj[3].setData(103,"Mary");
		obj[4].setData(104,"Rod");
		
		// display Faculty Object Data
		System.out.println("************** Faculty Details **************");
		for(int i=0; i<5; i++) {
			obj[i].showData();
		}
		System.out.println("*********************************************");

	}

}
