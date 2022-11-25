package day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.out.println("running before method-creating brower session");
		driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void tearup() {
		driver.quit();
		System.out.println("after method");
	}
  @Test
  public void onlyUsername() {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(" Admin");
	  driver.findElement(By.xpath(" //input[@id='btnLogin']")).click();
	  AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage'] ")).getText().contains("Password cannot be empty"));
  }
  @Test
  public void validCredentials() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(" Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(" ASDFwhuhpp3lhdz3k47iw%");
	  driver.findElement(By.xpath(" //input[@id='btnLogin']")).click();
	  Thread.sleep(2000);
	  AssertJUnit.assertTrue(driver.getCurrentUrl().contains("index.php"));
  }
  @Test
  public void onlyPassword() {
	  driver.findElement(By.xpath("//input[@id='txtPassword'] ")).sendKeys(" ASDFwhuhpp3lhdz3k47iw%");
	  driver.findElement(By.xpath(" //input[@id='btnLogin']")).click();
	  AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
	  //Assert.assertTrue(driver.getCurrentUrl().contains("index.php/auth/login"));
	  // //span[@id='spanMessage']  Username cannot be empty
  }
  @Test
  public void noCredentials() {
	  driver.findElement(By.xpath(" //input[@id='btnLogin']")).click();
	  AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
  }
}
