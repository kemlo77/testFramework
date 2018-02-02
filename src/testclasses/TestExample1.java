package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestExample1 {
	
	@BeforeClass
	public void setUp() {
		System.out.println("TestExample1 BeforeClass");
	}
	
	@AfterClass
	public void cleanUp() {
	System.out.println("TestExample1 AfterClass");
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
