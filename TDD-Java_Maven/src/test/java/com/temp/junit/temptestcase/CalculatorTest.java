package com.temp.junit.temptestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all First test methods");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After all First test methods");
	}

	@Test
	@DisplayName("First test")
	void addtest() {
		int c = Calculator.add(10, 10);
		assertEquals(20, c);
		System.out.println("Second test First method");
	}

	@Test
	@DisplayName("Second test")
	void subTest() {
		int c = Calculator.sub(10, 4);
		assertEquals(6, c);
		System.out.println("Second test First method");
	}
}
