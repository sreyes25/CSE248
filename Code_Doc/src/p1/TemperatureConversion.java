package p1;
// inline comments
/*block comment
 * what ever in put on these won't go on java doc
 * 
 */

/**
 * Tbe TemperatureConversion Java Application prints a table converting
 * celsius to Fahrenheight
 * @see
 * @see<A HREF="./src/p1/TemperatureConversion.java/">
 * Java Source Code (https://www.webnbee.com) </A>
 * @author Sergio Reyes <A HREF="reyesasergio@icloud.com"> reyesasergio@icloud.com </A>
 *
 *@version 1.0
 */
public class TemperatureConversion {

	public static void main(String[] args) {
		/**
		 * The main method prints a Celsius to Fahrenheight conversion table.
		 * The bounds of the table range from -50C +50C in 10 degree increments
		 */
		
		final double TABLE_BEGIN = -50.0;
		final double TABLE_END = 50.0;
		final double TABLE_STEP = 10.0;
		
		double celsius;
		double fahrenheit;
		
		System.out.println("TEMPERATURE CONVERSIONS");
		System.out.println("-----------------------");
		System.out.println("Celsius		Fahrenheit");
		
 		for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) {
 			fahrenheit = celsiusToFahrenheit(celsius);
 			System.out.printf("%6.2fC", celsius);
 			System.out.printf("%14.2fF\n", fahrenheit);
			
		}
 		System.out.println();
		
	}

	/**
	 * Convert a temperature from Celsius degrees to Fahrenheit degrees.
	 * @param c
	 * 		temperature in Celsius
	 * @return
	 * 		temperature c converted to Fahrenheit
	 *@throws java.lang.IllegalArgumentException
	 *		indicates that c is less than the smallest Celsius temperature
	 */
	public static double celsiusToFahrenheit(double c) {
		double MINIMUM_CELSIUS = -273.16;
		if(c < MINIMUM_CELSIUS) {
			throw new IllegalArgumentException();
		}
		return (9.0/ 5.0) * c + 32;
	}

}
