package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

	@ParameterizedTest
	@ValueSource(ints= {8,10,30,14,20})
	public void testIntArrayParam(int arg)
	{
		System.out.println("arg:"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	@DisplayName("all test cases are passed")
	@ParameterizedTest
	@ValueSource(strings= {"hello","world"})
	public void testParam(String msg) 
	{
		Assertions.assertNotNull(msg);
		
	}
	
	
	public void testLambdaList()
	{
		Integer[] intAry= {10,20,5,25};
		List<Integer> intList=Arrays.asList(intAry);
		
		Assertions.assertAll(
	    ()->assertEquals(10,intList.get(0)),
		()->assertEquals(20,intList.get(1)),
		()->assertEquals(15,intList.get(2)),
		()->assertEquals(25,intList.get(3)),
		()->assertNull(null)
		);
	}
	
	@RepeatedTest(value=3,name="Repeat 3 times")
	public void repeattest()
	{
		int a=10,b=20;
		Assertions.assertEquals(200, (a*b));
	}
	
	
	
}
