import java.util.Scanner;

public class AnimalPicker {
	public static void main(String[] args) {
		
		String animal;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hello! Would you like to see a dog or cat?");
		
		// possibly can implement switch statement here
		animal = userInput.nextLine().toUpperCase();
		
		
		if (animal.equals("CAT")) {
			System.out.println("Cat ASCII art here:");
		} else if (animal.equals("DOG")) {
			System.out.println("Dog ASCII art here:");
		} else {
			System.out.println("That is an invalid option.");
			animal = userInput.nextLine().toUpperCase();
		}
		
		
	}
}