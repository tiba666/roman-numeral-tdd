package converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FahrenheitToCelsiusTest {


    @Test
    public void mustBeAbleToCreateConverter() {
        // Arrange

        // Act
        FahrenheitToCelsiusConverter c = new FahrenheitToCelsiusConverter();

        // Assert
        assertTrue(c instanceof FahrenheitToCelsiusConverter);
    }


    @Test
    public void mustBeNegative30WhenFahrenheitIsNegative30(){

        var tempInFahrenheit = -30;
        var expectedInCelsius = -34.4;

        FahrenheitToCelsiusConverter c = new FahrenheitToCelsiusConverter();

        var result = c.convertToCelsius(tempInFahrenheit);


        assertEquals(expectedInCelsius, result , 0.09);

    }

    @Test
    public void mustBe0WhenFahrenheitIs32(){

        var tempInFahrenheit =32;
        var expectedInCelsius = 0;

        FahrenheitToCelsiusConverter c = new FahrenheitToCelsiusConverter();

        var result = c.convertToCelsius(tempInFahrenheit);


        assertEquals(expectedInCelsius, result , 0.09);

    }

}
