package testNG_BasicAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4_BC_AC {
	public WebDriver driver;
	
	  @BeforeClass
	  public void setup() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver= new ChromeDriver();
			 Thread.sleep(5000);
	  }
	  
	  @AfterClass
	  public void teardown() throws InterruptedException
	  {
		  driver.close();
		  Thread.sleep(5000);
	  }
	  
	  @Test(priority=1)
	    public void verify_sdpage() throws InterruptedException {
			 driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			String EXPtitle="Swag Labs";
			String ACTtitle=driver.getTitle();
			Assert.assertEquals(EXPtitle, ACTtitle);
	  }
	  
	  @Test(priority=2)
	  public void verify_seleniumpage() throws InterruptedException {
			 driver.get("https://www.selenium.dev/");
			Thread.sleep(5000);
			String EXPtitle="Selenium";
			String ACTtitle=driver.getTitle();
			Assert.assertEquals(EXPtitle, ACTtitle);
	}
	  

 
}
