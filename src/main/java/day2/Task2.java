package day2;

import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);
		
		List<WebElement> allElements=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement ele: allElements) {
			String str=ele.getText();
			System.out.println(str);
			if(str.contains("26")) {
				ele.click();
			}
		}
	}

}
