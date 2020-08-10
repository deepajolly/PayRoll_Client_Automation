package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ClientPage;

import pageobject.CreateClient;
import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{
	LoginPage l;
	ClientPage f;
	CreateClient c;
  @Test(priority=0)
  public void login() throws InterruptedException {
	  l=new LoginPage(driver);
	  l.username();
	  l.password1();
	  
	  boolean g=l.loginPageValidation();
	  Assert.assertTrue(g);
	  System.out.println("First Test Pass");
	  
	  l.login();
	  
	  String b=l.validateLoginpagetitle();
	  System.out.println(b);
	  Assert.assertEquals(b, "Payroll Application");
	   
  }
  
  @Test(priority=1)
  public void clientPageTest() throws InterruptedException
  {
	  f=new ClientPage(driver);
	  f.clientExam();
      
	  boolean z=f.searchbuttonValidation();
	  Assert.assertTrue(z);
	  System.out.println("Second Test Pass");
	  
	  String h=f.validateclientpagetitle();
	  System.out.println(h);
	  Assert.assertEquals(h, "Clients");
	  
	  f.searchid();
  }
  
  @Test(priority=2)
  public void createClientTest() throws InterruptedException
  {
	  c=new CreateClient(driver);
	  c.create();
	  	   	  
	  boolean y=c.savebuttonValidation();
	  Assert.assertTrue(y);
	  System.out.println("Third Test Pass");
	  
	  String x=c.createclientTitle();
	  System.out.println(x);
	  Assert.assertEquals(x, "Create Client");
	  
	  c.save();
  }
  
 
}
