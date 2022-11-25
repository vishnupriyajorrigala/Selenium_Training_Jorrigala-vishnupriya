package test;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Task7 {
	public  void t6() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
           
		driver.get("https://ineuron-courses.vercel.app/login");
           
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
		WebElement username=driver.findElement(By.name("email1"));
	        username.sendKeys("ineuron@ineuron.ai\r\n");
	        driver.findElement(By.id("password1")).sendKeys("ineuron");
	        Assert.assertTrue(driver.getCurrentUrl().contains("ineuron"));
	        driver.findElement(By.className("submit-btn")).click();
		    
	        Actions act=new Actions(driver);
		    WebElement web=driver.findElement(By.xpath(" //span[normalize-space()='Manage']"));
		    Thread.sleep(3000);
		   act.moveToElement(web).perform();
		   driver.findElement(By.xpath(" //span[normalize-space()='Manage Categories']")).click();
		   Thread.sleep(3000);
		   String parent=driver.getWindowHandle();
		   Set<String> allWindowHandle=driver.getWindowHandles();
			
			System.out.println("Total Set values "+allWindowHandle);
			
			int count=allWindowHandle.size();
			
			System.out.println("Total count is "+count);
			
			
			for(String child:allWindowHandle)
			{
				
				if(!child.equals(parent))
				{
					
					driver.switchTo().window(child);
					String newTitle=driver.getTitle();
					System.out.println("New title is "+newTitle);
					
				}
				
				
			}
		   driver.findElement(By.xpath(" //button[normalize-space()='Add New Category']")).click();
		   Alert alt=driver.switchTo().alert();
		   alt.sendKeys("selenium");
		   alt.accept();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/button[1]")).click();
		   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='action-btn'][normalize-space()='Delete'] ")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //button[normalize-space()='Sign out']")).click();
	}


}
