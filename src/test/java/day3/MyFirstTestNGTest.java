package day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNGTest {
  @Test
  public void login() {
	  System.out.println("login done");

	  }
  @Test
	  public void createAccount() {
	  AssertJUnit.assertEquals(2, 2);
	  	System.out.println("account created");
	  	
	  }@Test
  
	  public void deleteAccount() {
	  	System.out.println("account delete");
	  }
	  @Test
	  public  void logOutFromApplication() {
	  	System.out.println("logout done");
	  }
}
