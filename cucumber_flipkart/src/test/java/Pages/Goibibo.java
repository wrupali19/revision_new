package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Goibibo {
	WebDriver driver;
	private By link_bus = By.xpath("//span[@class='header-sprite nav-icon-bus gr-append-right5']");
	private By source = By.xpath("//input[@id='autosuggestBusSRPSrcHome']");
	private By destination = By.xpath("//input[@id='autosuggestBusSRPDestHome']");
	private By date = By.xpath("//input[@data-testid='openCheckinCalendar']");
	private By selectdate = By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-sc-r2jz2t-7 gJsKZe']/li//span[text()='17']");
	private By bus_search = By.xpath("//button[@data-testid='searchBusBtn']");
	private By close_cross =By.xpath("//div[@class='sc-bQtKYq eLqpla']");
	private By bus_type = By.xpath("//div[text()='AC']//span[@class='FiltersBlockstyles__TabIconWrap-sc-v6hq3g-0 bRgIPn']");   
	private By departure_time =By.xpath("(//div[@class='FiltersBlockstyles__BusTypeFiltersWrap-sc-v6hq3g-11 faQIkU']//div[text()='6 AM - 12 noon'])[1]");
	private By arrival_time = By.xpath("(//div[@class='FiltersBlockstyles__BusTypeFiltersWrap-sc-v6hq3g-11 faQIkU']//div[text()='6 AM - 12 noon'])[2]");
	private By select_bus = By.xpath("(//p[text()='DNR Express'])[1]/parent::div/following-sibling::div[2]//button//span[text()='SELECT SEAT']");
	private By boarding_pt = By.xpath("(//p[text()='08:35'])[2]/parent::div");
	private By droping_pt = By.xpath("(//p[text()='11:10'])[2]/parent::div");
	private By seat_book = By.xpath("//div[@class='SeatWithTooltipstyles__BusSeat-sc-dkrka-2 jmYmam']");
	private By continue_btn = By.xpath("//button[text()='CONTINUE']");
	private By txt_fullname = By.xpath("//input[@placeholder='Enter Full Name']");
	private By txt_age =By.xpath("//input[@placeholder='Age']");
	private By sel_gender = By.xpath("//ul[@class='genderTabs ']/li[2]/img");
	private By txt_email = By.xpath("//input[@data-val='email']");
	private By txt_mobile = By.xpath("//input[@data-val='contactNum']");
	private By btn_pay = By.xpath("//button[@class='ReviewPagestyles__PayButton-sc-fmjc42-13 bYqmLn']");
	
	
	public Goibibo(WebDriver driver)
    {
		this.driver = driver;
	}
	
	public void busfrom(String bussource) throws InterruptedException
	{
		//driver.findElement(close_cross).click();
		driver.findElement(link_bus).click();
		Thread.sleep(5000);
		WebElement selectsource = driver.findElement(source);
		selectsource.click();
		selectsource.sendKeys("Nag");
		Thread.sleep(5000);
		 List<WebElement> optionlistsource=driver.findElements(By.xpath("//section[@class='AutoSuggeststyles__AutoSuggest-sc-aqwuwp-0 fTGPNO']/ul/div/div/li"));
		 
		 for(WebElement ele :optionlistsource)
		 {
			 int count=0;
			 String currentoption = ele.getText();
			 if(currentoption.contains(bussource))
			 {
				 ele.click();
				 count++;
				break;
			 }
		 };
		
	}
	
	public void busto(String busdestination) throws InterruptedException
	{
		WebElement selectsource = driver.findElement(destination);
		selectsource.click();
		selectsource.sendKeys("Cha");
		Thread.sleep(5000);
		 List<WebElement> optionlistdest=driver.findElements(By.xpath("//section[@class='AutoSuggeststyles__AutoSuggest-sc-aqwuwp-0 fTGPNO']/ul/div/div/li"));
		 
		 for(WebElement ele :optionlistdest)
		 {
			 int count=0;
			 String currentoption = ele.getText();
			 if(currentoption.contains(busdestination))
			 {
				 ele.click();
				 count++;
				break;
			 }
		 };
	}
	
	public void selectdate() throws InterruptedException
	{
		driver.findElement(date).click();
		Thread.sleep(2000);
		driver.findElement(selectdate).click();
	}
	
	public void searchbuses() throws InterruptedException  
	{
		driver.findElement(bus_search).click();
		Thread.sleep(2000);
		driver.findElement(bus_type).click();
		Thread.sleep(2000);
		driver.findElement(departure_time).click();
		Thread.sleep(2000);
		driver.findElement(arrival_time).click();
		Thread.sleep(2000);
		driver.findElement(select_bus).click();
		Thread.sleep(2000);
		driver.findElement(boarding_pt).click();
		Thread.sleep(2000);
		driver.findElement(droping_pt).click();
		driver.findElement(seat_book).click();
		Thread.sleep(2000);
		driver.findElement(continue_btn).click();
		Thread.sleep(2000);
		driver.findElement(txt_fullname).sendKeys("Rupali");
		Thread.sleep(2000);
		driver.findElement(txt_age).sendKeys("32");
		Thread.sleep(2000);
		driver.findElement(sel_gender).click();
		Thread.sleep(2000);
		driver.findElement(txt_email).sendKeys("wrupali19@gmail.com");
		Thread.sleep(2000);
		driver.findElement(txt_mobile).sendKeys("9922092303");
		Thread.sleep(2000);
		driver.findElement(btn_pay).click();
		
		
		
		
	}

}

