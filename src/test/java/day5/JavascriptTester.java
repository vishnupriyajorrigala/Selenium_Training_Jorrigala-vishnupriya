package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavascriptTester {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement username = driver.findElement(By.id("name"));
		username.sendKeys("jorrigala vishnupriya");
		
		WebElement username1 = driver.findElement(By.id("email"));
		username1.sendKeys("vishnupriyajorrigala@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("vishnu11");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//input[@id='637d031ad8e5c83b9610ed5b']")));
        js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@id='637d031ad8e5c83b9610ed5b']")));
      
        js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//div[@class='genders-div']//div[2]//input[1]")));
        WebElement female=driver.findElement(By.xpath("//div[@class='genders-div']//div[2]//input[1]"));
        js.executeScript("arguments[0].click()",female);
        
        Select select=new Select(driver.findElement(By.xpath("//select[@id='state']")));
       List<WebElement> l=select.getOptions();
       for(WebElement s:l) {
    	   String str=s.getText();
    	   if(str.equalsIgnoreCase("Telangana")) {
    	   System.out.println(str);
    	   s.click();
    	   break;
       }
    	  
       }
       driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
       
	}

}
