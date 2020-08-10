package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.CreateClient;
import utilities.BaseClass;

public class CreateClientTest extends BaseClass{
	CreateClient c;
  @Test
  public void client() throws InterruptedException {
	  c=new CreateClient(driver);
	  c.create();
	  
	  String x=c.createclientTitle();
	  System.out.println(x);
	  Assert.assertEquals(x, "Create Client"); 
	  
	  boolean y=c.savebuttonValidation();
	  Assert.assertTrue(y);
	  System.out.println(" third Test Pass");
	  
	  c.save();
  }
}
