package testrunjava;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrapdropdown {

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
		for (int i = 0;i<dd.size();i++)
		{
		WebElement loop = dd.get(i);
		String loopdata = loop.getAttribute("innerHTML");	
		//System.out.println(loopdata);
		if(loopdata.contentEquals("Javascript"))
		{
			loop.click();
			break;
		}
		}
		
		}
		
		
	}


