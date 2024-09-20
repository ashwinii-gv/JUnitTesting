package com.tns.junit;
import static org.junit.jupiter.api.Assertions.assertNotNull;//assert methods are static
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class AssertionDemo {
	@Test // 1 failure
	
	public void checkaasertequal() {
		int res=2;
		int exp=1;
		//assertNotEquals gives no failure here
		assertEquals(res,exp);// all assert methods are static
		
	}
	@Test
	public void testcheckassertequal() {
		assertFalse("Hello".contains("m"));
	}
	@Test
	public void testNull() {
		String s="hello";
		assertNotNull(s);
	}

}
