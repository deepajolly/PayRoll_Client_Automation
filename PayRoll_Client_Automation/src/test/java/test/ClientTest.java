package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ClientPage;
import utilities.BaseClass;

public class ClientTest extends BaseClass{
	ClientPage f;
  @Test
  public void page() throws InterruptedException {
	  f=new ClientPage(driver);
	  f.clientExam();
	 
	  boolean z=f.searchbuttonValidation();
	  Assert.assertTrue(z);
	  System.out.println(" second Test Pass");
	  
	  String h=f.validateclientpagetitle();
	  System.out.println(h);
	  Assert.assertEquals(h, "Clients");
	  
	  f.searchid();
	  
	 
	  
  }
  
}
