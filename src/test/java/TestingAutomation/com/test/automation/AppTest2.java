package TestingAutomation.com.test.automation;

import static org.junit.Assert.assertTrue;

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
public class AppTest2 
{
	private WebDriver driver;
	private WebDriverWait wait;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private final String pathToAvanza = "http://www.avanza.se";
	
	@Before
	public void before() {
	
		System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
	}
	
	@Test
    public void appTest2() throws InterruptedException
    {
    	driver.get(pathToAvanza);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div/a[2]"))).click();
    	assertTrue("Logo not visible", wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mainNav\"]/div/div/a/img"))).isDisplayed());
    }
	
	@After
	public void after() {
		driver.quit();
	}
}
