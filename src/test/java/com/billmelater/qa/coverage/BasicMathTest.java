package com.billmelater.qa.coverage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicMathTest {
	private BasicMath bm = null;
	
	@BeforeTest
	public void setup() {
		bm = new BasicMath();
	}
	
	  @Test
	  public void testAddFunction() {
		  int expectedResult = 7;
		  int result = bm.addTwoNums(3, 4);
		  assert expectedResult == result;
	  }
	  
	  @Test
	  public void testSubtractFunction() {
		  int expectedResult = -2;
		  int result = bm.subtractTwoNums(5, 7);
		  assert expectedResult == result;
	  }
	  
	  @Test
	  public void testMultiplyFunction() {
		  long expectedResult = 27;
		  long result = bm.multiplyTwoNums(9, 3);
		  assert expectedResult == result;
	  }
	  
	  @Test
	  public void testDivideFunction() {
		  double expectedResult = 3.0;
		  double result = bm.divideTwoNums(9, 3);
		  assert expectedResult == result;
	  }
	  
	  @Test
	  public void testAbsoluteValueLessThanZero() {
		  int expectedResult = 15;
		  int result = bm.absoluteValue(-15);
		  assert expectedResult == result;
	  }
	  
	  @Test
	  public void testAbsoluteValueGreaterThanZero() {
		  int expectedResult = 77;
		  int result = bm.absoluteValue(77);
		  assert expectedResult == result;
	  }
	  
	  @Test
	  public void testAbsoluteValueEqualToZero() {
		  int expectedResult = 0;
		  int result = bm.absoluteValue(0);
		  assert expectedResult == result;
	  }
  
  @AfterTest
  public void teardown() {
	  bm = null;
  }
}
