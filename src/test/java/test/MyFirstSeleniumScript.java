package test;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MyFirstSeleniumScript {


@Test
   public void t1() {
        
        ChromeDriver driver=new ChromeDriver();
	    
	   //FirefoxDriver driver=new FirefoxDriver();
	   //EdgeDriver driver=new EdgeDriver();
        
        driver.get("http://www.google.com");
        AssertJUnit.assertTrue(driver.getCurrentUrl().contains("google"));
        driver.findElement(By.name("q")).sendKeys("Vishnu priya");
        
        String title=driver.getTitle();
        System.out.println("Title is "+ title);
        String url = driver.getCurrentUrl();
        
        System.out.println("URL is "+url);
        
        //driver.quit();
        



   }



}