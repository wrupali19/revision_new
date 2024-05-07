package browser.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelecctorPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("rupali");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id^='ss']")).sendKeys("Rupa12345#");
		
	}

}
