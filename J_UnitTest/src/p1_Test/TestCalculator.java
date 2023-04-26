package p1_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import p1.Calculator;

public class TestCalculator {
	static Calculator c;
	
	@BeforeAll
	public static void setUp() { 
		c = new Calculator();
	}
	
	@Test
	@DisplayName("{Test Add}")
	public void testAdd() {
		assertEquals(10.0, c.add(5.0,5.0), 0.0001);
		
	}
	@Test
	@DisplayName("{Test Subtract}")
	public void testSubtract() {
		assertEquals(5.0, c.subtract(10.0,5.0));
	}
	
	@AfterAll
	public static void teardown() {
		System.out.println("Done");
	}
	
}
