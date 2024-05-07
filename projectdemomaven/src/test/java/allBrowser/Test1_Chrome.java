package allBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1_Chrome {
  @Test
  public void sdPage() throws InterruptedException {
	//TC1- lunch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//TC6- verify login
		String EXPtitle="Swag Labs";
		String ACTtitle=driver.getTitle();
		if(ACTtitle.equals(EXPtitle))
		Assert.assertEquals(EXPtitle, ACTtitle);
		Thread.sleep(5000);
		
		//TC7- Close the browser
		driver.close();
}
  }

