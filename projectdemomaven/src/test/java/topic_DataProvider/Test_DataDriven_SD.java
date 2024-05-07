package topic_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;  

/*public class Test_DataDriven_SD 
{
	public WebDriver driver;
	
  @Test(dataProvider="testData_SD")
  public void login_SD(String uname, String paswrd) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//TC3- fill username textbox with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		Thread.sleep(5000);
		
		//TC4- fill passward textbox with input
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(paswrd);
		Thread.sleep(5000);
		
		//TC5- click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
		
		//TC6- verify login
		String EXPurl="https://www.saucedemo.com/inventory.html";
		String ACTurl=driver.getCurrentUrl();
		Assert.assertEquals(EXPurl, ACTurl);
	  
  }
  
  @DataProvider(name="testData_SD")
  public Object[][] readExel() throws BiffException , IOException
  {
	//open the exel file for read and write, which is available in our project
	 File f= new File("C:\\Automation\\projectdemomaven\\src\\test\\resources\\allResourceFile\\TestData_SwagDemo.xls");
	 Workbook w = Workbook.getWorkbook(f);
	 Sheet s =w.getSheet(0);
	 int noofrows=s.getRows();
	 System.out.println(noofrows);
	 int noofcoloum =s.getColumns();
	 System.out.println(noofcoloum);
	 
	 //creating an array to store data from exel sheet
	 String inputData[][]=new String[noofrows-1][noofcoloum];
	 int count=0;
	 for(int i=1; i<noofrows; i++)
	 {
		 for(int j=0; j<noofcoloum; j++)
		 {
			 Cell c = s.getCell(j,i);
			 inputData[count][j]=c.getContents();
			 
		 }
		 count++;
	 }
	 return inputData;
	 
	 
	  
  }
  
  public void getTestResult()
  {
	  driver.close();
  }
}*/
