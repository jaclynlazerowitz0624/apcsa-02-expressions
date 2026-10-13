/**
 * Exercise 7 — TemperatureConverter
 *
 * Convert both directions, to one decimal place.
 *
 *   C = (F - 32) * 5 / 9
 *   F = C * 9 / 5 + 32
 *
 * ⚠️ Careful: 5 / 9 in integer arithmetic is 0.
 *    Everything after that will be zero. Fix it.
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;

        double calcC = (fahrenheit - 32) * 5.0/9.0;
        double rCelsius = Math.round(calcC * 10.0) / 10.0;

        double calcF = (celsius * 9.0/5.0) + 32;
        double rFahrenheit = Math.round(calcF * 10.0) / 10.0;

        System.out.println(fahrenheit + " degrees Fahrenheit is " + rCelsius + " degrees celsius.");
        System.out.println(celsius + " degrees Celsius is " + rFahrenheit + " degrees fahrenheit.");

    }
}
