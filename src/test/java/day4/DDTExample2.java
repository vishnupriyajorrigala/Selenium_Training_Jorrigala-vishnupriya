package day4;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DDTExample2{
    
    
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.out.println("running before method-creating brower session");
        driver=new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/login");
    }
    
    @AfterMethod
    public void tearup() {
        driver.quit();
        System.out.println("after method");
    }
    
  @Test(dataProvider="testdata")
  public void myTest(String username,String password) throws InterruptedException{
      
      driver.findElement(By.name("email1")).sendKeys(username);
        driver.findElement(By.id("password1")).sendKeys(password);
        
        driver.findElement(By.className("submit-btn")).click();
        Thread.sleep(3000);
        //Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='ENROLLED']")).getText().contains("ENROLLED"));
        AssertJUnit.assertEquals(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed(),true);
      
  }
  
  @Test
@DataProvider(name="testdata")
  public Object[][] testDataGeneration(){
      
      Object [][]arr=new Object[4][2];
      
      arr[0][0]="sample9@gmail.com";
      arr[0][1]="Mukesh1234";
      arr[1][0]="samplemukesh@gmail.com";
      arr[1][1]="Mukesh1234";
      arr[2][0]="samplemukesh1@gmail.com";
      arr[2][1]="Mukesh1234";
      arr[3][0]="samplemukesh2@gmail.com";
      arr[3][1]="Mukesh1234";
    return arr;
  }
  
}
