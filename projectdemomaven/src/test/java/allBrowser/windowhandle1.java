package allBrowser;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(5000);
		Set<String> windowhandle =driver.getWindowHandles();
		System.out.println(windowhandle);
		Iterator<String> s1 = windowhandle.iterator();
		String parentwindow = s1.next();
		System.out.println(parentwindow);
		String childwindow = s1.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("wrupali19@gmail.com");
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		driver.switchTo().window(parentwindow);
		driver.close();

		
	}

}
