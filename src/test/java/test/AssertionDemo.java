package test;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionDemo {
  @Test
  public void login() {
      AssertJUnit.assertTrue(true);
      System.out.println("login done");
  }
  @Test(dependsOnMethods="login")
  public void creat() {
      System.out.println("Account created");
      
  }
}
