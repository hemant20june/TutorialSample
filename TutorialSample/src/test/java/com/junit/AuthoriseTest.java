package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AuthoriseTest {
	
	Authorise authorise;
	UserInfo userInfo ;
	UserStorage userStorage;
	
	boolean expected ;
	boolean actual ;
	
	@Before
	public void setup(){
		userInfo = mock(UserInfo.class);
		Mockito.when(userInfo.getName()).thenReturn("Test");
		Mockito.when(userInfo.getDOB()).thenReturn("22/12/1990");
		Mockito.when(userInfo.getPhone()).thenReturn("9876543210");
		
		userStorage = mock(UserStorage.class);
		Mockito.when(userStorage.readFromFile()).thenReturn("8922eT");
		
		authorise = new Authorise();
		expected = true;
	}
	
	@Test
	public void isAuthorise_Sucess(){
		actual = authorise.isAuthorise(userInfo, userStorage);
		assertEquals(expected, actual);
	}
	
	@Test
	public void isAuthorise_Fail(){
		userStorage = mock(UserStorage.class);
		Mockito.when(userStorage.readFromFile()).thenReturn("8988eT");
		
		actual = authorise.isAuthorise(userInfo, userStorage);
		assertNotEquals(expected, actual);
	}
	
//	@Test
//	public void isAuthorise_EMPTY_String(){
//		userInfo = mock(UserInfo.class);
//		Mockito.when(userInfo.getName()).thenReturn("");
//		Mockito.when(userInfo.getDOB()).thenReturn("");
//		Mockito.when(userInfo.getPhone()).thenReturn("");
//		
//		userStorage = mock(UserStorage.class);
//		Mockito.when(userStorage.readFromFile()).thenReturn("8988eT");
//		
//		actual = authorise.isAuthorise(userInfo, userStorage);
//		assertNotEquals(expected, actual);
//	}
//	
//	
//	@Test
//	public void isAuthorise_Null(){
//		userInfo = mock(UserInfo.class);
//		Mockito.when(userInfo.getName()).thenReturn(null);
//		Mockito.when(userInfo.getDOB()).thenReturn(null);
//		Mockito.when(userInfo.getPhone()).thenReturn(null);
//
//		actual = authorise.isAuthorise(userInfo, userStorage);
//		assertNotEquals(expected, actual);
//	}
//	
	
}
