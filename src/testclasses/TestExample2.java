package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import testbase.BaseTest;


public class TestExample2 extends BaseTest{
	
	@BeforeClass
	public void setUp() {
		System.out.println("TestExample2 BeforeClass");
	}
	
	@AfterClass
	public void cleanUp() {
	System.out.println("TestExample2 AfterClass");
	}
	
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
  
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
  
	@Test(dependsOnMethods= {"test2"})
	public void test3() {
		Assert.assertTrue(true);
	}
}
