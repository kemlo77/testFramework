package testbase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BaseTest -> beforeClass()");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("BaseTest -> afterClass()");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BaseTest -> beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("BaseTest -> afterTest()");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BaseTest -> beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("BaseTest -> afterSuite()");
  }

}
