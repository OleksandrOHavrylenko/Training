package com.luxoft.task1;

import org.junit.Test;

public class CalculatorTest {
	@Test		
	public void testMain() {
		String[] args = new String[3];
		args[0] = "2";
		args[1] = "+";				
		args[2] = "2";
		Calculator.main(args);

	}
}

