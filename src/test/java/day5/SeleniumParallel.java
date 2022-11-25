package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumParallel{
	WebDriver driver;
	
	@Parameters({"os","osVersion","browser","browserVersion"})
	@BeforeTest
	public void setup(String os,String osVersion,String browser,String browserVersion) {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("os", os);
		capabilities.setCapability("osVersion",osVersion );
		capabilities.setCapability("browserName",browser );
		capabilities.setCapability("browserVersion",browserVersion );
		
		
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
	  WebElement username=driver.findElement(By.name("email1"));
      username.sendKeys("ineuron@ineuron.ai\r\n");
      driver.findElement(By.id("password1")).sendKeys("ineuron");
      driver.findElement(By.className("submit-btn")).click();
  }
}

