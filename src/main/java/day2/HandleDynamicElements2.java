package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDynamicElements2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html\r\n");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='fname'] ")).sendKeys("sapient");
		driver.findElement(By.xpath("//input[@value='Show me'] ")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //input[@id='passnew']")));
		WebElement web=driver.findElement(By.xpath("//input[@id='passnew'] "));
		WebElement  ele=wait.until(ExpectedConditions.elementToBeClickable(web));
		ele.sendKeys("vishnu");
		

	}

}
