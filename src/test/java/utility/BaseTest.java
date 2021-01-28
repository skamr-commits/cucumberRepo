package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public static WebDriver driver;
	
	public static void initialisationDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void verifyHomePage() {
	try {
		Assert.assertEquals("https://www.thewarehouse.co.nz/", driver.getCurrentUrl());
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public static void closeDriver() {
		driver.close();
		driver.quit();
	}


}
