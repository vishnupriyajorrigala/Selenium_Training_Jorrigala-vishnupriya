package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo {
@Test
	public void seleniumpractice() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//button[normalize-space()='Try it'] ")).click();
	    wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        
        String msg=driver.switchTo().alert().getText();
        System.out.println(msg);
        AssertJUnit.assertTrue(true);
        if(msg.contains("Selenium")) {
        	System.out.println("is present");
        	alert.accept();
        	
        }
        else {
        	System.out.println("not present ");
        }
        //Thread.sleep(30000);
        
        
	}

}
