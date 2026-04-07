package builderpattern;

public class AmazonShop {

	public static void main(String[] args) {

		
		Purchase p = new Purchase();
		p.search();
		
		Shopping shop = new Shopping();
		
		shop.purchase();

		// sc1:
		shop.login("noman@gmail.com", "noman@123").search("Tshirt").addToCart("Tshirt")
				.doPayment("1212 1212 1212 1212", 123).generateOrder().logout();

		// sc2:
		shop.login("noman@gmail.com", "noman@123").search("macbook").addToCart("macbook").logout();

		// sc3:
		shop.login("noman@gmail.com", "noman@123").doPayment("1212 1212 1212 1212", 123).generateOrder().logout();

		// sc4:
		shop.login("noman@gmail.com", "noman@123").logout();

		// sc5:
		shop.login("noman@gmail.com", "noman@123").logout().login("noman@gmail.com", "noman@123");

	}

}
