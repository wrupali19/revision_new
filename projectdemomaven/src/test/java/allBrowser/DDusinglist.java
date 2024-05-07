package allBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.security.model.SecurityStateExplanation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class DDusinglist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://fssaiindia.in/fssai-food-safety-license-registration-for/supermarket/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    Thread.sleep(5000);
	    driver.switchTo().frame("iframe_form");
	    Thread.sleep(5000);
	    WebElement e =driver.findElement(By.xpath("//select[@id='wpforms-166-field_7']"));
	    e.click();
	     Select se = new Select(e);
	     se.selectByIndex(1);
		Thread.sleep(5000);
		driver.close();
		
	}

}
