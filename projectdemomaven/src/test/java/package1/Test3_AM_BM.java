package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3_AM_BM {
	
	public WebDriver driver;
	
  @BeforeMethod
  public void setup() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver= new ChromeDriver();
		 Thread.sleep(5000);
  }
  
  @AfterMethod
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

