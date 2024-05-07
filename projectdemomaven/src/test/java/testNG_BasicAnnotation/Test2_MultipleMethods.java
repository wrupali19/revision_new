package testNG_BasicAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_MultipleMethods {
	public WebDriver driver;
	
	
  @Test(priority=1)
  public void setup() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver= new ChromeDriver();
  }
  
        @Test(priority=2)
		public void geturl() throws InterruptedException {
        	
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		}
        
        @Test(priority=3)
        public void maximize() throws InterruptedException {
        // TC3- maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
        }
        
        @Test(priority=4)
        public void type_username() throws InterruptedException
        {
		
		//TC4- fill username textbox with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
        }
        
        @Test(priority=5)
		public void type_passward() throws InterruptedException {
		//TC5- fill passward textbox with input
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		}
		
        @Test(priority=6)
        public void click_login() throws InterruptedException {
		//TC6- click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
        }
		
        @Test(priority=7)
        public void verofy_login() throws InterruptedException {
		//TC7- verify login
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
        }
		
        @Test(priority=8)
        public void teardown() {
		//TC8- Close the browser
		driver.close();
        }
  
}

