package testrunjava;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrapdropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anupam\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		java.util.List<WebElement> dd =driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for (WebElement ele:dd)
		{
		
		String Strin1 = ele.getAttribute("innerHTML");	
		//System.out.println(loopdata);
		if(Strin1.contentEquals("JavaScript"))
		{
			ele.click();
			break;
		}
		}
		
		}
		
		
	}


