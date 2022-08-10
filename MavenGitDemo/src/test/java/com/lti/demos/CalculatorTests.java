package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class CalculatorTests {

	Calculator c=new Calculator();
	
	@Test
	public void testCalcSayHello()
	{
		Assertions.assertEquals("hello world",c.sayHello());
	}
	@Test
	public void TestAddTwoNos() {
		int result=c.addNos(100,200);
		Assertions.assertEquals(300, result);
	}
	@Test
	public void TestSubTwoNos() {
		int result=c.subNos(300, 100);
		Assertions.assertEquals(200, result);
	}
	@Test
	public void testAssertNulls()
	{
	    String s1=null;
	    String s2="mahi";
	    Assertions.assertNull(s1);
	}
	//@Disabled
	@Test
	public void testAssertfals()
	{
		Assertions.assertFalse("kk".length()==10);
		Assertions.assertFalse(10>20," false");
		Assertions.assertNotEquals("hello","Hello");
	}
	@Test
	public void testArrays()
	{
		ArrayList<Integer> myList=new ArrayList<>();
		Assertions.assertEquals(0,myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(100);
		myList.add(200);
		
		Assertions.assertEquals(2,myList.size());
	}
	}


