package allBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1_Edge {
  @Test
  public void sdPage() throws InterruptedException {
	//TC1- lunch Chrome browser
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
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

