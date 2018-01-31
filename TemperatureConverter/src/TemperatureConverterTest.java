import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureConverterTest {
    @Test
    public void testCelsiusToFahrenheit() {
        double result = TemperatureConverter.celsisusToFahrenheit(0);
        assertEquals(32.0, result, 0);

        result = TemperatureConverter.celsisusToFahrenheit(25);
        assertEquals(77.0, result, 0);
    }

    @Test
    public void testFahrenheitToCelsius() {
        double result = TemperatureConverter.fahrenheitToCelsius(86);
        assertEquals(30.0, result, 0);

        result = TemperatureConverter.fahrenheitToCelsius(23);
        assertEquals(-5.0, result, 0);
    }
}
