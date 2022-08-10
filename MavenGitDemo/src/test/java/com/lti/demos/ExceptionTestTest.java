package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExceptionTestTest {

	@Test
	 void test() {
		Assertions.assertThrows(IllegalArgumentException
				.class,
				()->{Integer.parseInt("one");}
				);
	}
	@Test
	public void testmethodExp()
	{
		Calculator c=new Calculator();
		
	}
	

}
