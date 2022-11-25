package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html\r\n");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		Thread.sleep(3000);
		List<WebElement> allElements=driver.findElements(By.xpath("//button[contains(@id='menu1')]//a"));
		//Thread.sleep(3000);
		for(WebElement ele: allElements) {
			String str=ele.getText();
			System.out.println(str);
			if(str.contains("JavaScript")) {
				ele.click();
				break;
			}
			
		}

	}

}
