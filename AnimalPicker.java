import java.util.Scanner;

public class AnimalPicker {
	public static void main(String[] args) {
		
		String animal;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hello! Would you like to see a drawing of a dog, cat,fish or horse?");
		
		boolean userSelected = false;
		// possibly can implement switch statement here
		
		while (!userSelected) {
			
			animal = userInput.nextLine().toUpperCase();

			switch(animal) {
			case "CAT":
				System.out.println("    |\\__/,|   (`\\\n  _.|o o  |_   ) )\n-(((---(((--------");
				userSelected = true;
				break;
			case "DOG":
				System.out.println("(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
				userSelected = true;
				break;
			case "FISH":
				System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;"
						+ "      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");
				userSelected = true;
				break;
			
				case "HORSE":
					System.out.println("            .\'\'\n  ._.-.___.\' (`\\\n //(        ( `\'\n\'/ )\\ ).__. ) \n\' <\' `\\ ._/\'\\\n   `   \\     \\");
				
				userSelected = true;
				
				break;

			default: 
				System.out.println("That is an invalid option. Please enter dog or cat.");
			}
		
		}
		/*
		if (animal.equals("CAT")) {
			System.out.println("Cat ASCII art here:");
		} else if (animal.equals("DOG")) {
			System.out.println("Dog ASCII art here:");
		} else {
			System.out.println("That is an invalid option.");
			animal = userInput.nextLine().toUpperCase();
		}
		*/
		userInput.close();
		
	}
}