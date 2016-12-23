package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TestFirstJunit {
	FirstJunit fj  ;
	int expected ;
	int actual ;
	
	@Before
	public void setup(){
		fj = new FirstJunit();
		expected =5;
	}
	

	@Test
	public void TestAdd_with_success(){
		actual =fj.Add(1,4);
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestAdd_with_fail(){
		actual =fj.Add(1,7);
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void TestAdd_with_Negative(){
		expected = -1;
		actual =fj.Add(1,-2);
		assertEquals(expected, actual);
	}
}
