package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.BasePage;

public class BaseTest {
	
	public static WebDriver driver;
	public BasePage app;
	
	@BeforeClass(alwaysRun = true)
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suicpet\\eclipse-workspace\\MavenExample\\src\\main\\java\\webdriver\\chromedriver\\windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximizeaza fereastra browserului
		driver.get("https://keyfood.ro/");
		app = new BasePage(driver);

	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
Thread.sleep(4000);//bad practice
		
		driver.quit();//inchide tot browserul cu toate taburile
	}	
}
	
