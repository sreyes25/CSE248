package p2_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import p2.Calculator;

public class TestCalculator {
	static Calculator c;
	
	@BeforeAll
	public static void setup() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("{Test Add}")
	public void testAdd() {
		assertEquals(10.0, c.add(5.0,5.0), 0.0001);
	}
	
}
