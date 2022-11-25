package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumScript2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup ");
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.id("name"));
		username.sendKeys("jorrigala vishnupriya");
		
		WebElement username1 = driver.findElement(By.id("email"));
		username1.sendKeys("vishnupriyajorrigala@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("vishnu11");
		
		WebElement interestCheck = driver.findElement(By.xpath("//div[@class='interests-div']//div[1]"));
		interestCheck.click();
		Thread.sleep(1000);
		WebElement gender=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		gender.click();
		
		WebElement state=driver.findElement(By.xpath("//option[@value='Telangana']"));
		state.click();
		
		WebElement signup=driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
		signup.click();
	}

}
