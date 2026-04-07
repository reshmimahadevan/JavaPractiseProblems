package exceptionhandling;

// For CrossBrowserTesting.java
public class MyException extends RuntimeException {

	public MyException(String mesg) {
		// Supply the error to RuntimeException and let it know about the error and let the Java
		// decide what exception to print
		super(mesg);
	}

}
