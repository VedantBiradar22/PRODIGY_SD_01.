import java.util.Scanner;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit and Kelvin
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius and Kelvin
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheitToCelsius(fahrenheit) + 273.15);
    }

    // Convert Kelvin to Celsius and Fahrenheit
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvinToCelsius(kelvin) * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                System.out.printf("%.2f°C is %.2f°F and %.2fK.\n", temperature, 
                    celsiusToFahrenheit(temperature), celsiusToKelvin(temperature));
                break;
            case 'F':
                System.out.printf("%.2f°F is %.2f°C and %.2fK.\n", temperature, 
                    fahrenheitToCelsius(temperature), fahrenheitToKelvin(temperature));
                break;
            case 'K':
                System.out.printf("%.2fK is %.2f°C and %.2f°F.\n", temperature, 
                    kelvinToCelsius(temperature), kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid unit entered.");
                break;
        }

        scanner.close();
    }
}
