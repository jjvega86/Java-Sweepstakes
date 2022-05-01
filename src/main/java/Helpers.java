import java.util.Random;
import java.util.Scanner;

public class Helpers {
	
	public static String takeInput(String input){
		System.out.println(input);
		Scanner sc = new Scanner(System.in);
		String response = sc.nextLine();
		return response;
		
	}
	
	public static void print(String input) {
		System.out.println(input);
	}
	
	public static int generateRandomInteger(int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(max);
		return randomNumber;
	}
	
	public static int convertStringToInt(String s) {
		int convertedValue;
		try {
			convertedValue = Integer.parseInt(s);
			
		} catch(NumberFormatException e) {
			convertedValue = 0;
			
		}
		return convertedValue;
	}

}
