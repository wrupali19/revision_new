
package StepsDefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Stepbackgroundflipkart1 {
//	 static WebDriver driver;
//	
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\cucumber_flipkart\\src\\test\\resources\\Drivers\\chromedriver.exe");
//	    driver= new ChromeDriver();
//	    driver.manage().window().maximize();
//		driver.navigate().to("https://www.flipkart.com/");
//		Thread.sleep(5000);	
//	}
//
//	@When("user enters username as a {string} and password as a {string}")
//	public void user_enters_username_as_a_and_password_as_a(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
//		  driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
//		   Thread.sleep(3000);
//	}
//
//	@When("clicks on login button")
//	public void clicks_on_login_button() throws InterruptedException {
//    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//    Thread.sleep(3000);
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//	   Thread.sleep(5000);
//	}
//
//	@When("I search product as a {string}")
//	public void i_search_product_as_a(String product) {
//		WebElement element = driver.findElement(By.name("q"));
//	element.sendKeys(product);
//	
//	WebElement searchbutton = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//	searchbutton.click();
//	}
//
//	@Then("product list should appear searching to the product search as a {string}")
//	public void product_list_should_appear_searching_to_the_product_search_as_a(String productname) throws InterruptedException {
//	By locator = By.xpath("//div[@class='_4rR01T']");
//	List<WebElement> productdesp = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//	
//	 
//		System.out.println(productdesp.size());
//		 
//	}
//	
//	@When("I select product Dell")
//	public void i_select_product_dell() throws InterruptedException {
//		
//	   driver.findElement(By.xpath("//div[@class='col col-7-12']//div[text()='DELL Inspiron Athlon Dual Core 3050U - (8 GB/256 GB SSD/Windows 11 Home) Inspiron 3525 Notebook']")).click();
//	   //Thread.sleep(5000);
//		
//	}
//
//	@Then("click on Addtokart the product")
//	public void click_on_addtokart_the_product() throws InterruptedException {
//	   //driver.findElement(By.xpath("//ul[@class='row']//li[@class='col col-6-12']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//		//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
//		//WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
//		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='row']//li[@class='col col-6-12']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"))).click();
//		//Thread.sleep(5000);
//		//driver.findElement(By.xpath("(//li[@class='col col-6-12'])/button")).click();
//		 WebElement element = null;
//		element = (new WebDriverWait(driver,Duration.ofSeconds(10) )).until(ExpectedConditions
//                .visibilityOfElementLocated(By
//                        .xpath("//ul[@class='row']//li[@class='col col-6-12']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
//			
//		element.click();
//	}
//
//	
	}
