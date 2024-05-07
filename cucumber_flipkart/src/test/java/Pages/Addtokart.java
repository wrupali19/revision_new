package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtokart {
	WebDriver driver;
	
	private By btn_addtokart = By.xpath("//input[@id='add-to-cart-button']");
	
	public Addtokart(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void addtokartandproceed() throws InterruptedException
	{
		try
		{
		//	drivernew.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		//	 WebDriverWait wait = new WebDriverWait(driver, 90);
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
	      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btn_addtokart));
	     element.click();
	  // driver.findElement(btn_addtokart).click();
			 
		}
		catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
	}
	

}
