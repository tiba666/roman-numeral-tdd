package converter;

public class FahrenheitToCelsiusConverter {
    public FahrenheitToCelsiusConverter(){

    }


    public double convertToCelsius(double tempInFahrenheit) {

        double result =(tempInFahrenheit - 32)*5/9;

        return result;
    }
}
