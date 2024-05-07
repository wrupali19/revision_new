package allBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class Actionclasspratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement txtusername = driver.findElement(By.cssSelector("input#email"));
		
		
		
	
		// use action class
		Actions ans = new Actions(driver);
		Actions moveoverhome = ans
				.moveToElement(txtusername)
				.click()
				.keyDown(txtusername,Keys.SHIFT)
				.sendKeys("rupali");
				moveoverhome.build().perform();
				
				
				
		
				
				
		

	}

}
