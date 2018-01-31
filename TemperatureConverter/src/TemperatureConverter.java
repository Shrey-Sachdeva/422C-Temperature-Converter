/**
 * @author Shrey Sachdeva
 * @version 1.0
 * This class converts temperatures between Fahrenheit and Celsius.
 */
public class TemperatureConverter {
	/**
	 * This method converts a given temperature in Celsius to Fahrenheit.
	 * @param celsius is the temperature measured in Celsius
	 * @return fahrenheit, which is celsius converted to Fahrenheit
	 */
	public static double celsisusToFahrenheit(double celsius) {
		
		double fahrenheit = (9.0/5.0)*celsius + 32;
		return fahrenheit;
	}

    /**
     * This method converts a given temperature in Fahrenheit to Celsius.
     * @param fahrenheit is the temperature measured in Fahrenheit
     * @return celsius, which is fahrenheit converted to Celsius
     */
	public static double fahrenheitToCelsius(double fahrenheit){
		
		double celsius = (5.0/9.0)*(fahrenheit - 32);
		return celsius;
		
	}

	public static void main(String [] args) {
		System.out.println(celsisusToFahrenheit(32));
	}

}
