package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {
	 WebDriver  driver;
	private By sym_cross = By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div' and @class='close']");
	private By link_train = By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains']");
	private By txt_from = By.xpath("//input[@id='fromCity']");
	private By txt_hydfrom = By.xpath("//input[@placeholder='From']");
	private By txt_punto = By.xpath("//input[@placeholder='To']");
	private By datepicker_date = By.xpath("//input[@id='travelDate']");
	private By selected_date = By.xpath("//div[@aria-label='Sat Oct 22 2022']");
	private By click_class= By.xpath("//span[@class='appendBottom5 downArrow']");
	private By select_class= By.xpath("//ul[@class='travelForPopup']//li[text()='First AC']");
	private By searchtrain= By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']");
	private By seatavailable = By.xpath("//div[text()='PQWL 14']");
	private By okpopup = By.xpath("//div[@class='latoBold font16 deepskyBlueText textRight appendTop100 pointerCursor']");
	private By addtraveler = By.xpath("//span[@class='bold font14 capText']");
	private By txt_name = By.xpath("//input[@id='name']");
	private By txt_age = By.xpath("//input[@id='age']");
	private By slt_gender = By.xpath("//div[@class='selectedQuotaContainer noSelection makeRelative']//p[@class='selectedQuota close cursorPointer latoBold font12 makeFlex']//span[text()='Select']");
	private By ddgender = By.xpath("//div[@class='selectedQuotaContainer noSelection makeRelative']/ul/li/span[text()='Female']");
	private By sel_nationality = By.xpath("//div[@class='selectedQuotaContainer noSelection makeRelative']/ul/li//span[text()='India']");
	private By ddnationality = By.xpath("//p[@class='selectedQuota close cursorPointer latoBold font12 makeFlex']//span[text()='India']");
	private By ddberthpreferance = By.xpath("//div[@class='selectedQuotaContainer noSelection makeRelative']//p[@class='selectedQuota close cursorPointer latoBold font12 makeFlex']//span[text()='No Berth Preference']");
	private By sel_berthpreferance = By.xpath("//div[@class='selectedQuotaContainer noSelection makeRelative']/ul/li//span[text()='Lower']");
	private By addbutton = By.xpath("//button[@class='bluePrimarybtn latoBold font16']");
	private By userchange = By.xpath("//a[@class='makeFlex hrtlCenter deepskyBlueText appendRight15 latoBold font14']");
	private By createnewacc = By.xpath("//a[@class='font16 lineHeight20 capText latoBold']");
	private By txt_username = By.xpath("//div[@class='makeFlex wrap']/div//input[@placeholder='Type a username for your IRCTC account']");
	private By txt_emailaddress = By.xpath("//input[@placeholder='OTP will be sent to this email']");
	private By txt_password = By.xpath("//input[@placeholder='Type a password for your IRCTC account']");
	private By txtmobileno = By.xpath("//input[@placeholder='OTP will be sent to this mobile number']");
	private By txt_securiyuanswer = By.xpath("//input[@placeholder='Type an answer for your security question']");
	private By ddsecurityque = By.xpath("//p[@class='advSorterSelection ']/span//span[text()='What is your pet name?']");
	
	private By sel_securityque = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div[5]/div/ul/li[7]");
	//private By lbl_securityque = By.xpath("//p[@class='advSorterSelection ']/span//span[text()='Who was your Childhood hero?']");
	private By txt_firstname = By.xpath("(//div[@class='makeFlex']//input[@class='inputField  undefined' and @value=''])[1]");
	private By txt_lastname = By.xpath("(//div[@class='makeFlex']//input[@class='inputField  undefined' and @value=''])[1]");
	private By dd_dob = By.xpath("//input[@placeholder='Open calendar and select date']");
	//private By dd_ocupation = By.xpath("//p[@class='advSorterSelection ']/span//span[text()='Government']");
	//private By sel_occupation = By.xpath("//div[@id='root']/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/ul/li[6]");
	//private By sel_occupation =By.xpath("//div[@id='root']//div[@class='advSorterContainer inputFieldContainer']//ul[@class='sortOptions ']//li[text()='Student']");
	private By sel_gen = By.xpath("//ul[@class='makeFlex filtersList']/li/p[text()='Female']");
	private By mar_status = By.xpath("//ul[@class='makeFlex filtersList']/li/p[text()='Married']");
	private By sel_langauge = By.xpath("//div[@class='filters flexSliderWrap']//ul[@class='makeFlex filtersList']/li/p[text()='English']");
	
	
	
	
	
	
	
	
	
	public Makemytrip(WebDriver driver)
    {
		this.driver = driver;
	}
	
	public void trainfrom(String fromtrain) throws InterruptedException
	{
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		 Thread.sleep(3000);
		driver.findElement(sym_cross).click();
		 Thread.sleep(3000);
		 driver.switchTo().parentFrame();
		
		 Thread.sleep(3000);
		driver.findElement(link_train).click();
		 Thread.sleep(3000);
		 int count=0;
	    driver.findElement(txt_from).click();
	    Thread.sleep(3000);
	    driver.findElement(txt_hydfrom).sendKeys("hyd");
		  Thread.sleep(2000);
		  List<WebElement> optionlist=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
			 for(WebElement ele :optionlist)
			 {
				 String currentoption = ele.getText();
				 if(currentoption.contains(fromtrain))
				 {
					 ele.click();
					 count++;
					break;
				 }
			 };
			 if(count!=0)
			 {
				 System.out.println(fromtrain+"has been selected in the DD");
			 }
			 else
			 {
				 System.out.println("option u want to be selected is notaaiable");
			 }
	}
	
	public void trainto(String totrain) throws InterruptedException
	{
		Thread.sleep(3000);
		 int count=0;
		 WebElement eledata = driver.findElement(By.xpath("//input[@id='toCity']"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", eledata);
		  Thread.sleep(3000);
	    driver.findElement(txt_punto).sendKeys("pun");
		  Thread.sleep(2000);
		  List<WebElement> optionlist=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
			 for(WebElement ele :optionlist)
			 {
				 String currentoption = ele.getText();
				 if(currentoption.contains(totrain))
				 {
					 ele.click();
					 count++;
					break;
				 }
			 };
			 if(count!=0)
			 {
				 System.out.println(totrain+"has been selected in the DD");
			 }
			 else
			 {
				 System.out.println("option u want to be selected is notaaiable");
			 }
	}
	
	public void travelldate(String date) throws InterruptedException
	{
		driver.findElement(datepicker_date).click();
		Thread.sleep(3000);
		driver.findElement(selected_date).click();
	}
	
	public void travelclass() throws InterruptedException
	{
		driver.findElement(click_class).click();
		Thread.sleep(3000);
		driver.findElement(select_class).click();
	}
	
	public void searchtrain() throws InterruptedException
	{
		driver.findElement(searchtrain).click();
		Thread.sleep(3000);
		driver.findElement(seatavailable).click();
		Thread.sleep(3000);
		driver.findElement(okpopup).click();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(addtraveler).click();
		Thread.sleep(3000);
	}
	
	public void addtravellerinfo(String name, String age) throws InterruptedException
	{
	
		//driver.switchTo().alert();
	
		WebElement t = driver.findElement(txt_name);
		t.sendKeys(name);
		
		Thread.sleep(3000);
		driver.findElement(txt_age).sendKeys(age);
		Thread.sleep(3000);
		
	}
	 public void selectgender() throws InterruptedException
	 {
		driver.findElement(slt_gender).click();
		Thread.sleep(3000);
		driver.findElement(ddgender).click();
		Thread.sleep(3000);
		driver.findElement(ddnationality).click();
		Thread.sleep(3000);
		driver.findElement(sel_nationality).click();
		Thread.sleep(3000);
		driver.findElement(ddberthpreferance).click();
		Thread.sleep(3000);
		driver.findElement(sel_berthpreferance).click();
	 }
	 
	 public void addbutton() throws InterruptedException
	 {
		 Thread.sleep(3000);
			driver.findElement(addbutton).click();
	 }
	 public void changeaccount()
	 {
		 driver.findElement(userchange).click();
	 }
	 public void createnewaccount()
	 {
		 driver.findElement(createnewacc).click();
	 }
	 
	 public void accountsetup(String username, String emailaddress, String mobileno, String password, String securityanswer ) throws InterruptedException
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated((txt_username)));
		  Category_Body.sendKeys(username);
		//driver.findElement(txt_username).sendKeys(username);
		 Thread.sleep(3000);
		 driver.findElement(txt_emailaddress).sendKeys(emailaddress);
		 Thread.sleep(3000);
		 driver.findElement(txtmobileno).sendKeys(mobileno);
		 Thread.sleep(3000);
		 driver.findElement(txt_password).sendKeys(password);
		 Thread.sleep(3000);
		 driver.findElement(ddsecurityque).click();
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement Category_Body1 = wait1.until(ExpectedConditions.visibilityOfElementLocated((sel_securityque)));
		// Category_Body1.click();
		Thread.sleep(3000);
		WebElement as = driver.findElement(sel_securityque);
	     as.click();
		//driver.findElement(sel_securityque).click();
		 //JavascriptExecutor js = (JavascriptExecutor)driver;
			//WebElement button =driver.findElement(By.xpath("sel_securityque"));
		      // js.executeScript("arguments[0].click();",button );
		// Thread.sleep(3000);
		// driver.findElement(lbl_securityque);
		 
		 driver.findElement(txt_securiyuanswer).sendKeys(securityanswer);
		 Thread.sleep(3000);
		  }
	 
	 public void personalinfo(String firstname, String lastname) throws InterruptedException
	 {
		 try
		 {
		 driver.findElement(txt_firstname).sendKeys(firstname);
		 Thread.sleep(3000);
		 driver.findElement(txt_lastname).sendKeys(lastname);
		 Thread.sleep(3000);
		 WebElement p = driver.findElement(dd_dob);	
		 p.sendKeys("January 19, 1989");
		 p.click();
		 
		 // driver.findElement(dd_ocupation).click();
		
		 Thread.sleep(3000);

		
		// driver.findElement(sel_occupation).click();
		 Thread.sleep(3000);
		 driver.findElement(sel_gen).click();
		 Thread.sleep(3000);
		 driver.findElement(mar_status).click();
		 Thread.sleep(3000);
		 driver.findElement(sel_langauge).click();
		 }
		 catch(Exception e)
		 {
			 
		 }
		 
	 
    
	 }
}
