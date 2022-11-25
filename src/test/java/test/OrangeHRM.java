package test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class OrangeHRM {
	@Test
	public  void orangehrm() throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a//b[text()='Admin']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mukesh Otwani");
		driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("vishnu");
		driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("vishnu@123");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("vishnu@123");
        AssertJUnit.assertTrue(true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnSave']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("vishnu");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("vishnu@123");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

}
