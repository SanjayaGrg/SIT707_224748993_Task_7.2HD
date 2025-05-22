package sit707_week7;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Sanjaya Kumar Gurung
 */

public class TemperatureConverterTest {
    private TemperatureConverter converter = new TemperatureConverter();
    private static final double DELTA = 0.001;

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), DELTA);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), DELTA);
    }
    
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), DELTA);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), DELTA);
    }
    
    @Test
    public void testCelsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0), DELTA);
        assertEquals(373.15, converter.celsiusToKelvin(100), DELTA);
    }
    
    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, converter.kelvinToCelsius(273.15), DELTA);
        assertEquals(100.0, converter.kelvinToCelsius(373.15), DELTA);
    }
    
    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(273.15, converter.fahrenheitToKelvin(32), DELTA);
        assertEquals(310.928, converter.fahrenheitToKelvin(100), DELTA);
    }
    
    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(32.0, converter.kelvinToFahrenheit(273.15), DELTA);
        assertEquals(-279.67, converter.kelvinToFahrenheit(100), DELTA);
    }
    
    // This test will fail initially
    @Test
    public void testFailingConversion() {
        // Intentionally wrong - 0°C is 32°F, not 0°F
        assertEquals(0.0, converter.celsiusToFahrenheit(0), DELTA);
    }
    
    @Test
    public void testExtremeTemperatures() {
        assertEquals(-459.67, converter.kelvinToFahrenheit(0), DELTA);
        assertEquals(-273.15, converter.kelvinToCelsius(0), DELTA);
    }
}