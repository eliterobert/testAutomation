package TestingAutomation.com.test.automation;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	private WebDriver driver;
	private WebDriverWait wait;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private final String pathToAvanza = "http://www.google.se";
	
	@Before
	public void before() {
		DesiredCapabilities dc = DesiredCapabilities.chrome(); 
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		wait = new WebDriverWait(driver, 10);
	}
	
	@Test
    public void testAvanzaLoad() throws InterruptedException
    {
    	driver.get(pathToAvanza);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[2]"))).click();
    	assertTrue("Logo not visible", wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"logo\"]"))).isDisplayed());
    	System.out.println("BOOM, Avanza works!");
    }
	
	@After
	public void after() {
		driver.quit();
	}
	
}
