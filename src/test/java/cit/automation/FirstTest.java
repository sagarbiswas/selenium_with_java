package cit.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void firstTestMethod()
	{
		WebDriver driver = new FirefoxDriver();

        System.out.println( "Starting Selenium project - open naukri.com" );
        driver.get("http://naukri.com");
        System.out.println( "Starting Selenium project - quit driver" );
        //driver.quit();
		
	}
	
	// you have to set your username and password to auto login.
	@Test
	public void firstChromeTest()
	{
		ChromeOptions options = new ChromeOptions(); // POM has to be change if chrome version is diff - today date - Mar 2023
        options.addArguments("--diable--notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        WebElement element = driver.findElement(By.xpath("//*[@id = 'email']"));
        element.sendKeys("YOUR_LOGIN_EMAIL");
        WebElement element2 = driver.findElement(By.xpath("//*[@id = 'pass']"));
        element2.sendKeys("YOUR_PASSWORD");
         
        element2.submit();
		
	}
}
