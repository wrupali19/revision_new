package StepsDefinations;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Addtokart;
import Pages.loginamazonpage;
import io.cucumber.java.en.*;

public class StepAmazonIndia {
	
	public static WebDriver driver=null;
	public static  loginamazonpage lmp;
	public static  Addtokart atk;
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(5000);	
	}

	@When("user enters username as a {string} and password as a {string}")
	public void user_enters_username_as_a_and_password_as_a(String username, String password) {
		 lmp = new loginamazonpage(driver);
		lmp.loginvaliduser(username, password);
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	
		lmp.login();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		driver.getPageSource().contains("Hello, Rupali");
		Thread.sleep(5000);
	}
	  
	  @When("I search product as a {string}")
	  public void i_search_product_as_a(String productname) {
		  
	      lmp.searchproduct(productname);
	  }

	  @Then("product list should appear searching to the product search as a {string}")
	  public void product_list_should_appear_searching_to_the_product_search_as_a(String string) {
		  lmp.resultsearch();
		  
	      }
	  @And("I select product night suits for women")
	  public void i_select_product_night_suits_for_women() throws InterruptedException {
	     lmp.selectproduct();
	     Thread.sleep(5000);
	  }

	  @Then("click on add to kart button")
	  public void click_on_add_to_kart_button() throws InterruptedException {
		 lmp.addtokartandproceed();
		  
	  }
	      
	      
	  
}



