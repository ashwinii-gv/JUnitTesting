package com.tns.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFunction {

@Test
@DisplayName("FactorialTest")
public void factorialTest() {
	int exp=120;
	int act=NumberFunction.getFactorial(5);
	assertEquals(exp,act);
}
}
