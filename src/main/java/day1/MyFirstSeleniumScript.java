package day1;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MyFirstSeleniumScript {



   public static void main(String[] args) {
        
        //ChromeDriver driver=new ChromeDriver();
	    
	   FirefoxDriver driver=new FirefoxDriver();
	   //EdgeDriver driver=new EdgeDriver();
        
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Vishnu priya");
        
        String title=driver.getTitle();
        System.out.println("Title is "+ title);
        String url = driver.getCurrentUrl();
        System.out.println("URL is "+url);
        //driver.quit();
        



   }



}