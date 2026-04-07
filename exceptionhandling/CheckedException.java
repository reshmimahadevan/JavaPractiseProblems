package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	// Checked Exception is also known as Compile time exception
	public static void main(String[] args) {

		System.out.println("A");

		// InterruptedException is a checked exception that occurs when a thread is
		// interrupted while it is performing a blocking operation (like sleeping,
		// waiting, or joining).Think of it as a "tap on the shoulder" from one thread
		// to another, signaling that the second thread should stop what it's doing and
		// wrap up its current task.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("B");

		try {
			FileInputStream ip = new FileInputStream("c:\\documents\\test.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
