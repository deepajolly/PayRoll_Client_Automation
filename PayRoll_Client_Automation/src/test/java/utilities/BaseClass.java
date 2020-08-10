package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BaseClass {
	public WebDriver driver;
	  @BeforeSuite
	  public void upurl() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\ChromedriverNew\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.qabible.in/payrollapp/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	  }
	  @AfterSuite
	  public void exit()
	  {
		 // driver.quit();
	  }
	  /*@DataProvider
	  public Object[][] dp() throws BiffException, IOException {
		  FileInputStream f=new FileInputStream("C:\\Users\\dell\\Desktop\\Payroll.xls");
		  Workbook w=Workbook.getWorkbook(f);
		  Sheet s=w.getSheet("Sheet1");
		  int rw=s.getRows();
		  int co=s.getColumns();
		  System.out.println("Row"+rw+"Columns"+co);
		  String[][] input=new String[rw][co];
		  for(int i=0;i<rw;i++)
		  {
			  for(int j=0;j<co;j++)
			  {
				  Cell c=s.getCell(j,i);
				  input[i][j]=c.getContents();
				  
			  }
		  }
	    return input;
	     
	    
	  }*/
}
