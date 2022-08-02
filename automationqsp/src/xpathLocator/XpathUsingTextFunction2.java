package xpathLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathUsingTextFunction2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();//open browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("wdbbwdhbwd");
		
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("manager");
		
		driver.findElement(By.xpath("(//button[normalize-space()='Log In'])[1]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
