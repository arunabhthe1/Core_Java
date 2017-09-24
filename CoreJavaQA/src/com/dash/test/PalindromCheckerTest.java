package com.dash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dash.PalindromChecker;

public class PalindromCheckerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		assertFalse("Not Palindrom number :",PalindromChecker.isPalindrome("Deleveed"));
		assertFalse("Not Palindrom number :",PalindromChecker.isPalindrome("Arunabh"));
		assertFalse("Not Palindrom number Empty String :",PalindromChecker.isPalindrome(""));
		assertTrue("Palindrom number :",PalindromChecker.isPalindrome("Deleveled"));
		assertTrue("Palindrom number :",PalindromChecker.isPalindrome("Deleeled"));
		assertTrue("Palindrom number :",PalindromChecker.isPalindrome("deleveleD"));
		
	}

}
