package accessmodifier;

public class Car {

	//Data Members : Variables+Methods : Same rule
	//Same rule applies to Constructor for all in same package only
	//Class cannot be private/protected/default -> public only allowed ->only final/abstract/public
	//Overriden - private -> not allowed / protected ->parent class(protected) childclass(public/protected) allowed
	//            default -> parent class(default) childclass(default/public/protected) allowed
	//            public  -> only public
	
	String name; //default
	public int price;
	protected String color;
	private String chasisNum;

	
	public static void main(String args[]) {
		// Same class
		// All are accessible(Private,Public,Default,Protected)
		Car c = new Car();
		c.chasisNum = "123";
		c.name = "Elantra";
		c.color = "Pink";
		c.price = 120000;
	}

}
