package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//button[normalize-space()='Try it'] ")).click();
	    wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        
        String msg=driver.switchTo().alert().getText();
        System.out.println(msg);
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
