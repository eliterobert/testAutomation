package TestingAutomation.com.test.automation;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

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

public class Test3 {

	private WebDriver driver;
	private WebDriverWait wait;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private final String pathToNetEnt = "https://www.netent.com/en/";
	
	@Before
	public void before() {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait = new WebDriverWait(driver, 10);
	}

	@Test
    public void testGoogleLoad() throws InterruptedException
    {
    	driver.get(pathToNetEnt);
    	driver.manage().window().maximize();
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/footer/div/div[2]/div[1]/p")));
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/span"))).click();
    	Thread.sleep(1500);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/footer/div/div[2]/div[1]/p")));
     	System.out.println("BOOM, NetEnt works!");
    }
	
	@After
	public void after() {
		driver.quit();
	}
	
}
