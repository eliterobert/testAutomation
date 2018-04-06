package TestingAutomation.com.test.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private WebDriver driver;
	private WebDriverWait wait;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private final String pathToGoogle = "http://www.google.se";
	
	@Before
	public void before() {
	
		System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
	}
	
	@Test
    public void appTest() throws InterruptedException
    {
    	driver.get(pathToGoogle);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[2]"))).click();
    	Thread.sleep(1500);
    }
	
	@After
	public void after() {
		driver.quit();
	}
}
