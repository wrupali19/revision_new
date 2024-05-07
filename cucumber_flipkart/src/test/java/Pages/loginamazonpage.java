package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginamazonpage {
	
	WebDriver driver;
	private By btn_signin = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	private By txt_username = By.xpath("//input[@name='email']");
	private By btn_continue = By.xpath("//input[@id='continue']");
	private By txt_password = By.xpath("//input[@name='password']");
	private By btn_login = By.xpath("//input[@id='signInSubmit']");
	private By txt_search =By.xpath("//input[@id='twotabsearchtextbox']");
	private By btn_search =By.xpath("//input[@id='nav-search-submit-button']");
	private By result_search = By.xpath("//span[text()='1-48 of over 30,000 results for']");
	private By product_select = By.xpath("//span[text()='Women Graphic Print Pyjama & T-Shirt(OCW-2171_Orange)']");
	//private By btn_addtokart = By.xpath("//div[@class='a-button-stack']//span[@class='a-declarative']//span[@id='submit.add-to-cart']//span[@class='a-button-inner']//input[@name='submit.add-to-cart']");
	//private By btn_addtokart = By.cssSelector("#add-to-cart-button");
	//private By btn_addtokart = By.xpath("//input[@id='add-to-cart-button']");
	private By link_seeall = By.xpath("//a[@aria-label='See more, Brand']");
	private By check_brand = By.xpath("//span[text()='Sweet Dreams']");
	private By check_price = By.xpath("//span[text()='₹500 - ₹1,000']");
	private By check_pattern = By.xpath("//span[text()='Polka dots']");
	//private By select_size = By.xpath("//select[@name='dropdown_selected_size_name']");
	
	
	
	public loginamazonpage(WebDriver  driver)
	{
		this.driver = driver;
	}
	public void loginvaliduser(String username, String password)
	{
		driver.findElement(btn_signin).click();
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(btn_continue).click();
		driver.findElement(txt_password).sendKeys(password);
	
		
	}
	
	public void login()
	{	
		driver.findElement(btn_login).click();
		
	}
	
	
	public void searchproduct(String productname)
	{
		driver.findElement(txt_search).sendKeys(productname);
		driver.findElement(btn_search).click();
	}
	
	public void resultsearch() {
		driver.findElement(result_search);
		
	}
	public void selectproduct() throws InterruptedException
	{
		driver.findElement(link_seeall).click();
		Thread.sleep(5000);
		driver.findElement(check_brand).click();
		Thread.sleep(5000);
		driver.findElement(check_price).click();
		Thread.sleep(5000);
		driver.findElement(check_pattern).click();
		Thread.sleep(5000);
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println(parentwindowhandle);
		driver.findElement(product_select).click();
		
		Thread.sleep(5000);
		for(String childtab:driver.getWindowHandles())
		{
			driver.switchTo().window(childtab);
		}
		Thread.sleep(5000);
		 Select dropdownsize = new Select(driver.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']")));
			dropdownsize.selectByVisibleText("L");
			Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sw-gtc']")).click();
		//driver.findElement(By.xpath("//span[@class='a-button-inner']//a[@class='a-button-text']")).click();
		Thread.sleep(5000);
		 Select quantity = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		 quantity.selectByVisibleText("2");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='ship-to-this-address a-button a-button-primary a-button-span12 a-spacing-medium  ']//span[@class='a-button-inner']")).click()
		 
		
		;
	  
		//WebElement testDropDown = driver.findElement(By.id("native_dropdown_selected_size_name"));  
		//Select dropdown = new Select(testDropDown);  
		//dropdown.selectByVisibleText("L");  
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='native_dropdown_selected_size_name']/option[@value='1,B08XT`1WF8ZS']")));
		
	}
	
	public void addtokartandproceed() throws InterruptedException
	{
		
		Thread.sleep(5000);
//	driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			
	}
			
		

	
		
	}
	
	
	

	
//	public void addtokartandproceed() throws InterruptedException
//	{
//		try
//		{
//		Thread.sleep(5000);
//		//WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
//	      //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btn_addtokart));
//	     //element.click();
//	   driver.findElement(btn_addtokart).click();
//			 
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
//	}


