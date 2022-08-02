package xpathLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathUsingTextFunction1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();//open browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys("wdbbwdhbwd");
		
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
