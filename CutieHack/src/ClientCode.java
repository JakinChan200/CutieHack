import java.util.Scanner;

public class ClientCode {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hi, this is a calculator that calculates your CO2 emmmitions."
				+ "\nThis tool will help you become more aware of your CO2 output and encourage\n"
				+ "you to reduce your emmisions.\n");
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("\nWhat is the brand of the car you own?");
		System.out.println("Toyota\nChevy\nNissan\nFord\nVolkswagon\nMercedes");
		String brand = userInput.nextLine();
		
		while(Calculator.isCarTypo(brand)){
			System.out.println("\nI'm sorry, but I do not recognize your input. Please try again: ");
			brand = userInput.nextLine();
		}
		
		System.out.println("\nWhat is the model of the car?");
		differentCarModels(brand);
		String model = userInput.nextLine();
		
		while(Calculator.isModelTypo(model)){
			System.out.println("\nI'm sorry, I do not recognize this input. Please try again: ");
			model = userInput.nextLine();
		}
		
		System.out.println("\nHow many miles do you usually drive per year?");
		int milesPerYear = userInput.nextInt();
		System.out.println("\nBased on your driving habits, you are releasing " + (4.6*milesPerYear)/11500 + 
				" metric tons of CO2 per year.\nIf you drive 5% less next year, you can reduce your CO2 output by "
				+ (4.6*(milesPerYear*.95))/11500 + " metric tons");
		
		userInput.close();
	}
	
	public static void differentCarModels(String input){
		String[] arr = Calculator.getCarModels(input);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
