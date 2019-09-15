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
		
		switch(inputType) {
		case 'F': inputValue = 1;
		case 'C': break;
		case 'K':
			default:
			System.exit(1);
		}
	}
}
