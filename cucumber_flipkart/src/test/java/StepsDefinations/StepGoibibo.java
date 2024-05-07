package StepsDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Goibibo;
import io.cucumber.java.en.*;

public class StepGoibibo {
	WebDriver driver;
	static Goibibo gbb;

	@Given("user is on home page")
		public void user_is_on_home_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\cucumber_flipkart\\src\\test\\resources\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver();
		    driver.manage().window().maximize();
		driver.navigate().to("https://www.goibibo.com/");
		Thread.sleep(5000);	
	}

	@When("select source as {string} from passenger want to go")
	public void select_source_as_from_passenger_want_to_go(String bussource) throws InterruptedException {
		gbb = new Goibibo(driver);
		gbb.busfrom(bussource);
	    
	}

	@And("select destination as {string} to passenger want to go")
	public void select_destination_as_to_passenger_want_to_go(String busdestination) throws InterruptedException {
	    gbb.busto(busdestination);
	}

	@And("passenger select travell date as {string}")
	public void passenger_select_travell_date_as(String string) throws InterruptedException {
	   gbb.selectdate();
	}

	@Then("click on Search buses button")
	public void click_on_search_buses_button() throws InterruptedException {
	   gbb.searchbuses();
	}


}

