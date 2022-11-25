package day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//input[@id='file-upload']"))).click().perform();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\visjorri\\Desktop\\uploadfile.exe");
	driver.findElement(By.xpath("//input[@id='file-submit']")).click();
			

	}

}
