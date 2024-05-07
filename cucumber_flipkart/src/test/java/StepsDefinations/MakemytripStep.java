package StepsDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Makemytrip;
import io.cucumber.java.en.*;

public class MakemytripStep {
	WebDriver driver;
	static Makemytrip mmt;
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(5000);	
		}

	@When("select location as {string} from user want to go")
	public void select_location_as_from_user_want_to_go(String fromtrain) throws InterruptedException {
		mmt = new Makemytrip(driver);
		mmt.trainfrom(fromtrain);
	}

	@When("select location as {string} to user want to go")
	public void select_location_as_to_user_want_to_go(String totrain) throws InterruptedException {		
	mmt.trainto(totrain);
	}

	@When("user select travell date as {string}")
	public void user_select_travell_date_as(String date) throws InterruptedException {
		mmt.travelldate(date);
	}
	
	
	@Then("select traveler class")
	public void select_traveler_class() throws InterruptedException {
		mmt.travelclass();
	}
	
	@Then("click on Search button")
	public void click_on_search_button() throws InterruptedException {
		mmt.searchtrain();
	}
	
	@When("user enter name as {string} and age as {string}")
    public void user_enter_name_as_and_age_as(String name, String age) throws InterruptedException {
		
       mmt.addtravellerinfo(name, age);
	}

	@When("user select gender , nationality, Berthpreference and Reservationtype")
	public void user_select_gender_nationality_berthpreference_and_reservationtype() throws InterruptedException
	{
	  mmt.selectgender();
	}
	

	@Then("click on Add button")
	public void click_on_add_button() throws InterruptedException {
		mmt.addbutton();
	}
	

@Given("no user account on IRCTC then click on change button")
public void no_user_account_on_irctc_then_click_on_change_button() {
	mmt.changeaccount();
}

@Given("click on create IRCTC new Account")
public void click_on_create_irctc_new_account() {
	mmt.createnewaccount();
}

@Then("Register with IRCTC create new account with Account Setup and user enters username as a {string} and Email Address as a {string} and  mobile number as a {string} and create password as a {string} and security Answer as a {string}")
public void register_with_irctc_create_new_account_with_account_setup_and_user_enters_username_as_a_and_email_address_as_a_and_mobile_number_as_a_and_create_password_as_a_and_security_answer_as_a(String username, String emailaddress, String mobileno, String password, String securityanswer) throws InterruptedException {
	mmt.accountsetup(username, emailaddress, mobileno, password, securityanswer);
}

@Then("adding personal info like enters firstname as a {string} and lastname as a {string}")
public void adding_personal_info_like_enters_firstname_as_a_and_lastname_as_a(String firstname, String lastname) throws InterruptedException {
	mmt.personalinfo(firstname, lastname);
	
	
}
@Then("user send dateofbirth and occupation")
public void user_send_dateofbirth_and_occupation() {
	
}

@Then("click on gender, marital preference and preffered language")
public void click_on_gender_marital_preference_and_preffered_language() {
	
}



}
