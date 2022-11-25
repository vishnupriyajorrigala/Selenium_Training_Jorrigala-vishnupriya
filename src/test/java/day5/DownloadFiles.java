package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFiles {
@Test
	public  void download(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[normalize-space()='Hello World.docx']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='DateTime.txt']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='index.html']")).click();

	}

}
