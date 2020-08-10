package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;


	@CacheLookup
	@FindBy(name="LoginForm[username]")
	WebElement user;
	@CacheLookup
	@FindBy(name="LoginForm[password]")
	WebElement password;
	@CacheLookup
	@FindBy(how=How.NAME,using="login-button")
	//@FindBy(name="login")
	WebElement login;

	public void username() throws InterruptedException
	{
		 user.sendKeys("carol"); 
		 Thread.sleep(2000);	
	}
	public void password1() throws InterruptedException
	{
		
		 password.sendKeys("1q2w3e4r");
		 Thread.sleep(2000);
	}
	public void login() throws InterruptedException
	{
		  login.submit();
		  Thread.sleep(2000);
		  System.out.println("Successfully login");
	}
	
	public String validateLoginpagetitle()
	{
		String a=driver.getTitle();
		return a;
	}
	public boolean loginPageValidation()
	{
		boolean g=login.isDisplayed();
		System.out.println(g);
		return g;
	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
