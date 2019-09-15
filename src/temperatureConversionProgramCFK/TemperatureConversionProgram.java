
/*
 	//Conversions Celsius to Fahrenheit and Kelvin:
	F to C: ((t-32.0f)*5.0f)/9.0f 
	C to K: t+273.15f 
	K to F: (((t-273.15f)*9.0f)/5.0f)+32.0f
*/


package temperatureConversionProgramCFK;
import java.util.*;
public class TemperatureConversionProgram {
	public static void main(String[] args) {
		
		Scanner playerInput = new Scanner(System.in);
		
		/*VARIABLE DECLARATIONS*/
		char inputType;
		char outputType;
		float inputValue;
		float returnValue;
		
		System.out.println("Voer het inputype temperatuur in: 'C,F,K'");
		inputType = playerInput.next().charAt(0);
		
		System.out.println("Voer het outputtype temperatuur in: 'C,F,K'");
		outputType = playerInput.next().charAt(0);
		
		System.out.println("Voer de waarde temperatuur in in cijfers");
		inputValue = playerInput.nextFloat();
		
		
		/*TO-CELSIUS-COMVERSION POINT*/
		//Here We Convert All Cases To Celsius// /*so later on we can convert a celsuis value to the prevered type*/
		/* We don't have an explicit conversion from Kelvin to Celsius, BUT WE DO KNOW how to convert Kelvin to Fahrenheit, AND THEN how to convert Fahrenheit to Celsius. So we can get away with doing something like the following on line 45*/
		/* To be quite honest: Yes we know we are converting Kelvin to Celsuis BUT.. The math looks very daunthing. This is an example of Magic Code. Nobody really knows whats happening. Only the computer I guess. I hope in the next commit to improve this*/
		
		switch(inputType) {
		case 'F':
			inputValue = ((inputValue-32.0f)*5.0f)/9.0f;
			break;
		case 'C':
			break;
		case 'K':
			inputValue = inputValue = ((((((inputValue-273.15f)*9.0f)/5.0f)+32.0f) - 32.0f)*5.0f)/9.0f;
			default:
			System.exit(1);
		}
	}
}
