package day1;
import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter temp in celsius");
		double Temperature= sc.nextDouble();
		double Farenheit= convertToFarenheit(Temperature);
		System.out.println(Farenheit);
		
		System.out.println("Enter temp in ferenhite");
		 Temperature=sc.nextDouble();
		 double celcius= convertTocelcius(Temperature);
		 System.out.println(celcius);
		 
		
		
		// TODO Auto-generated method stub

	}
	public static double convertToFarenheit(Double celsius) {
		double fahrenheit = 9 * (celsius / 5) + 32;
        return fahrenheit;
	}
	
	public static double convertTocelcius(Double fahrenheit) {
		double celcius= (fahrenheit - 32) * 5 / 9;
		return celcius;
	}
	


		
		
	}

