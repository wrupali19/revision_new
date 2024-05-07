package StepsDefinations;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginflipkartpage;

import io.cucumber.java.en.*;


public class Flipkartlogin_POM {
//	WebDriver driver;
//	loginflipkartpage login;
//	
////	@Before
////	public void setup() throws InterruptedException
////	{
////		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");
////		    driver= new ChromeDriver();
////		    
////		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		    driver.manage().window().maximize();
////		    Thread.sleep(5000); 
////	}
////	@After
////	public void teardown()
////	{
////		driver.close();
////		driver.quit();
////	}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\cucumber_flipkart\\src\\test\\resources\\Drivers\\chromedriver.exe");
//	    driver= new ChromeDriver();
//	    
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//	    Thread.sleep(5000); 
//		driver.navigate().to("https://www.flipkart.com/");
//		
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException{
//		
//		 login = new loginflipkartpage(driver);
//		login.enterusername(username);
//		login.enterpassword(password);
//		
//	  // driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
//	   //driver.findElement(By.xpath("//input[@id='password']")).sendKeys(username);
//	   Thread.sleep(3000);
//	   
//	   
//	}
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		login.clicklogin();
//	}
//	
//
//	@Then("navigated to flipkart home page")
//	public void navigated_to_flipkart_home_page()
//	{
//		login.sawmyaccount();
//		driver.close();
//	}


}
