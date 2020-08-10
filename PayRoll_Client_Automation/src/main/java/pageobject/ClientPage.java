package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
WebDriver driver;

@CacheLookup
@FindBy(name="ClientSearch[id]")
WebElement clientid;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\"]")
WebElement search;

@CacheLookup
@FindBy(xpath="//a[@href=\"/payrollapp/client/view?id=3\"]")
WebElement eye;

@CacheLookup
@FindBy(xpath = "//a[@href=\"/payrollapp/client/update?id=3\"]")
WebElement pencil;

@CacheLookup
@FindBy(name="Client[fax]")
WebElement fax;

@CacheLookup
@FindBy(xpath ="//button[@type=\"submit\"]")
WebElement save;

public void clientExam() throws InterruptedException
{
	WebElement client=driver.findElement(By.xpath("//a[text()=\"Clients\"]"));
	client.click();
	
	 clientid.sendKeys("3");
	 Thread.sleep(1000);
}
public void searchid() throws InterruptedException
{
	   search.submit();
	   Thread.sleep(3000);
	        
	      eye.click();
	      Thread.sleep(3000);
	      
	      WebElement client=driver.findElement(By.xpath("//a[text()=\"Clients\"]"));
	  	  client.click();
                 	           
	         pencil.click();
	         Thread.sleep(3000);
	         
	           fax.clear();
	           fax.sendKeys("400");
	           Thread.sleep(3000);
		
	               save.submit();
	               System.out.println("Successfully searched");
	
	               driver.navigate().to("https://www.qabible.in/payrollapp/client/update?id=3");
	               Thread.sleep(3000);
	}
public boolean searchbuttonValidation()
{
	boolean z=search.isDisplayed();
	System.out.println(z);
	return z;
}

public String validateclientpagetitle()
{
	String h=driver.getTitle();
	return h;
}
		
public ClientPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}