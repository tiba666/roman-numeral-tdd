package converter;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberToRomanNumeralTest {

    @Test
    public void mustBeAbleToCreateConverter() {
        // Arrange

        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();

        // Assert
        assertTrue(c instanceof NumberToRomanNumeralConverter);
    }

    @Test
    public void mustBeIWhemConvert1() {

        // Arrange
        var input = 1;
        var expected = "I";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeIIWhenConvert2() {

        // Arrange
        var input = 2;
        var expected = "II";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeIIIWhenConvert3() {

        // Arrange
        var input = 3;
        var expected = "III";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeIVWhenConvert4() {

        // Arrange
        var input = 4;
        var expected = "IV";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeVWhenConvert5() {

        // Arrange
        var input = 5;
        var expected = "V";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeVIWhenConvert6() {

        // Arrange
        var input = 6;
        var expected = "VI";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeIXWhenConvert9() {

        // Arrange
        var input = 9;
        var expected = "IX";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeXWhenConvert10() {

        // Arrange
        var input = 10;
        var expected = "X";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeXXXIXWhenConvert39() {

        // Arrange
        var input = 39;
        var expected = "XXXIX";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeXXXWhenConvert30() {

        // Arrange
        var input = 30;
        var expected = "XXX";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeLXXXWhenConvert80() {

        // Arrange
        var input = 80;
        var expected = "LXXX";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }


    @Test
    public void mustBeXCWhenConvert90() {

        // Arrange
        var input = 90;
        var expected = "XC";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeCCCIWhenConvert301() {

        // Arrange
        var input = 301;
        var expected = "CCCI";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeCDWhenConvert400() {

        // Arrange
        var input = 400;
        var expected = "CD";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeDWhenConvert500() {

        // Arrange
        var input = 500;
        var expected = "D";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeDCCCWhenConvert800() {

        // Arrange
        var input = 800;
        var expected = "DCCC";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeCMWhenConvert900() {

        // Arrange
        var input = 900;
        var expected = "CM";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeMWhenConvert1000() {

        // Arrange
        var input = 1000;
        var expected = "M";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeMMMWhenConvert3000() {

        // Arrange
        var input = 3000;
        var expected = "MMM";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeMMMCMXCIXWhenConvert3999() {

        // Arrange
        var input = 3999;
        var expected = "MMMCMXCIX";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

    @Test
    public void mustBeDCCCLXXXVIIIWhenConvert888() {

        // Arrange
        var input = 888;
        var expected = "DCCCLXXXVIII";
        // Act
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        var result = c.convert(input);

        assertEquals(expected, result);
    }

}
