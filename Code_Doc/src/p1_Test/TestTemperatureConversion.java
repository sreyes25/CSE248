package p1_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import p1.TemperatureConversion;

public class TestTemperatureConversion {
	@Test
	public void testCelsiusFahrenheight() {
		assertThrows(IllegalArgumentException.class, ()-> {
			TemperatureConversion.celsiusToFahrenheit(-275.0);
		});
		
		assertEquals(32.0, TemperatureConversion.celsiusToFahrenheit(0));
		
	}
	
}
