
package temperature;
import java.util.Scanner;

public class Temperatureconverter {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the temperature value: ");
	        double temperature = scanner.nextDouble();
	      
	        System.out.print("Enter the unit of temperature (C for Celsius, F for Fahrenheit): ");
	        char unit = scanner.next().charAt(0);
	       
	        double convertedTemperature;
	        
	
	        if (unit == 'C' || unit == 'c') {
	            convertedTemperature = celsiusToFahrenheit(temperature);
	            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", temperature, convertedTemperature);
	        } else if (unit == 'F' || unit == 'f') {
	            convertedTemperature = fahrenheitToCelsius(temperature);
	            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius%n", temperature, convertedTemperature);
	        } else {
	            System.out.println("Invalid unit entered. Please enter C for Celsius or F for Fahrenheit.");
	        }
	        
	        scanner.close();
	    }

	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9/5) + 32;
	    }

	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5/9;
	    }
	   
	}



