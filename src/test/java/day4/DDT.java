package day4;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DDT{
	WebDriver driver;

	@BeforeMethod
	public void Setup() throws InterruptedException {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



	}

	@AfterMethod
	public void dump() {
		driver.quit();
	}

	@Test (dataProvider="testdata")
	public void myTest(String Email,String password) throws InterruptedException {

		WebElement username=driver.findElement(By.xpath("//input[@id='email1']"));
		username.sendKeys(Email);

		WebElement pass=driver.findElement(By.xpath("//input[@id='password1']"));
		pass.sendKeys(password);




		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/"));
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
	}
	@Test
	@DataProvider(name="testdata")
	public Object[][] testdatacreate(){

		Object [][] arr=null;
		try {
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/SapientTestData.xlsx")));
			int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
			int columns=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
			arr =new Object [rows][columns];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					arr [i][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
				}
			}
			wb.close();
		} catch(FileNotFoundException e) {
			System.out.println("Chcek for the file path "+e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Check for the input "+e.getMessage());
		}
		return arr;
	}
}