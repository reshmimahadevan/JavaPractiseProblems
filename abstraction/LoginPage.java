package abstraction;

public class LoginPage extends Page {
	
	public LoginPage()
	{
		System.out.println("LoginPage Constructor....");
	}
	
	public LoginPage(int a )
	{
		System.out.println("LoginPage Constructor...."+a);
	}

	@Override
	public void title() {
		System.out.println("Login Page Title");
	}

	@Override
	public void url() {
		System.out.println("Login Page URL");
	}

	@Override
	public void loading() {
		System.out.println("Login Page Loading in 5 secs");
	}
	
	//Individual
	public void doLogin()
	{
		System.out.println("Login to App");
	}

}
