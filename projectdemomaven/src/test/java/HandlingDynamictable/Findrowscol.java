package HandlingDynamictable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;
import java.text.ParseException;

public class Findrowscol {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		double m=0, r=0;
		List <WebElement> cols = driver.findElements(By.xpath("(//table[@class='dataTable'])/thead/tr[1]/th"));
		System.out.println("number of coloum size :" + cols.size());
		
		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("number of rows size :" + rows.size());
		
		WebElement data= driver.findElement(By.xpath("(//div[@id='leftcontainer'])/table/tbody/tr[6]/td[4]"));
		String getdata = data.getText();
		System.out.println(getdata);
		
	for(int i=1; i<rows.size(); i++)
	{
		String max = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
		 NumberFormat f =NumberFormat.getNumberInstance(); 
         Number num = f.parse(max);
         max = num.toString();
         m = Double.parseDouble(max);
         if(m>r)
          {    
             r=m;
          }
     }
     System.out.println("Maximum current price is : "+ r);
}
	
		
		

	}


