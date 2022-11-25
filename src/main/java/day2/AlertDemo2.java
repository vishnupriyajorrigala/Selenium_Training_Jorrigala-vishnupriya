package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//button[normalize-space()='Try it'] ")).click();
	    
	    try {
	    	wait.until(ExpectedConditions.alertIsPresent());
	    	Alert alert = driver.switchTo().alert();
	        
	        String msg=alert.getText();
	        System.out.println(msg);
	        //Thread.sleep(3000);
	        alert.accept();
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }

	}

}
