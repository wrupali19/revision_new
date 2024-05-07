package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_SingleMethod {
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
		
		//TC3- fill username textbox with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		
		//TC4- fill passward textbox with input
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		
		//TC5- click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
		
		//TC6- verify login
		String EXPurl="https://www.saucedemo.com/inventory.html";
		String ACTurl=driver.getCurrentUrl();
		if(ACTurl.equals(EXPurl))
		{
			System.out.println("Login Success- Test passed");
		}
		else
		{
			System.out.println("Login Failed-Test Failed");
		}
		Thread.sleep(5000);
		
		//TC7- Close the browser
		driver.close();
}
  }

