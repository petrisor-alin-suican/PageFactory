package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "path catre/chromedriver.exe")
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximizeaza fereastra browserului
		driver.get("https://keybooks.ro/");

	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
Thread.sleep(4000);//bad practice
		
		driver.quit();//inchide tot browserul cu toate taburile
	}	
}
	
