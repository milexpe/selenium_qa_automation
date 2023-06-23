package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;

public class BaseTest {
	public WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","path_to_chromedriver_here");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		  driver.quit();
	}
	
	
}
