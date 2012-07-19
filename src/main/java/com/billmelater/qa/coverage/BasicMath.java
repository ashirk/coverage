package com.billmelater.qa.coverage;

public class BasicMath {
	
	public int addTwoNums(int a, int b) {
		return a + b;
	}
	
	public int subtractTwoNums(int a, int b) {
		return a - b;
	}
	
	public long multiplyTwoNums(int a, int b) {
		return a * b;
	}
	
	public double divideTwoNums(int a, int b) {
		return a / b;
	}
	
	public int absoluteValue(int a) {
		if (a < 0) {
			return a * -1;
		} else if (a > 0) {
			return a;
		} else {
			return 0;
		}
	}

}
