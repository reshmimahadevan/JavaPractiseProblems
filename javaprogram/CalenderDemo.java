package javaprogram;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(c.getTime()));
		
	    System.out.println(c.get(Calendar.DAY_OF_MONTH)); 
	    
	    System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    
	    System.out.println(c.get(Calendar.AM_PM));
	    
	    System.out.println(c.get(Calendar.MINUTE));
				

	}

}
