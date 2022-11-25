package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest{
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("osVersion","8" );
		capabilities.setCapability("browserName","Chrome" );
		capabilities.setCapability("browserVersion","latest-beta" );
		
		
		URL url=null;
		try {
			url = new URL("https://vishnupriyajorri_Im2hoE:k8zxxxpcLUeDbJh2fxJf@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          driver=new RemoteWebDriver(url,capabilities);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
  @Test
  public void ineuron() {
	  driver.get("https://ineuron-courses.vercel.app/login");
	  Assert.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/login"));
  }
}
