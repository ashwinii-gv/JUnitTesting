package com.tns.junit;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
//@Test not allowed

public class First {
	//@Disabled()
		@DisplayName("MY TEST 1")
		@Test// it is method level and cant be applied on class
		void display() {
			System.out.println("My test method");
		}
		@RepeatedTest(4)
		@DisplayName("MY TEST 2")
		@Test
		void Hello()
		{
			System.out.println("greet");
		}
}
