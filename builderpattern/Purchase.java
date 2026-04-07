package builderpattern;

public class Purchase {
	
	public void purchase()
	{
		System.out.println("Purchasing......");
	}
	
	public Purchase search() {
		System.out.println("genre search");
		return this;
	}

}
