package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	Calculator c=new Calculator();
	
	@BeforeAll
	public static  void testStartDbConn()
	{
		System.out.println("DB connection is up-only once");
	}
	
	@BeforeEach
	public void testStartup()
	{
		int sum=0;
		System.out.println("sum is Zero");
	}


	@Test
	public void TestAddTwoNos() {
		System.out.println("test case 1");
		int result=c.addNos(100,200);
		Assertions.assertEquals(300, result);
	}
	@Test
	public void TestSubTwoNos() {
		System.out.println("test case 2");
		int result=c.subNos(300, 100);
		Assertions.assertEquals(200, result);
	}
	@AfterEach
	public void testShutDown()
	{
		System.out.println("some object null");
	}
	@AfterAll
	public static  void testStartDbConn1()
	{
		System.out.println("DB connection is down-only once");
	}
	
}

