package guiTests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class GraphicalTest1 {
  @Test
  public void firstTest() {
	  Assert.assertTrue(5>10*Math.random());
  }
  
  @Test
  public void secondTest() {
	  Assert.assertTrue(5>10*Math.random());
  }
  
  @Test
  public void thirdTest() {
	  Assert.assertTrue(5>10*Math.random());
  }
  
  @Test
  public void fourthTest() {
	  Assert.assertTrue(5>10*Math.random());
  }
}
