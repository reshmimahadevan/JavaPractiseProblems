package javaprogram2025;

public class TestExecution {
	
	//A method calling itself - recursive function
	//If recursion not handled properly then stack overflow happens
	//No memory deallocation happens
	
	public static void getNum()
    {
 	   System.out.println("Get Number");
 	   getNum();
    }

	public static void main(String[] args) {

           TestExecution.getNum();
	}

}
