import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		int input1;
		int input2;
		int input3;
		int range;
		Scanner fuzzyScanner = new Scanner(System.in);//must have this System.in
		
		// validation scanner business
		System.out.println("What number to input?");
		// hasNextInt..literally, "has int"
		while (!fuzzyScanner.hasNextInt()) {
			System.out.println("Invalid fuzzy input... please  input a different fuzzy number");
			fuzzyScanner.next(); // loops it ...try again
		}
			
		input1 = fuzzyScanner.nextInt();
		//fuzzyScanner.nextLine();  nextLine NOT needed!! ONLY for String...  not integers....  
		//lets a user input (eg to a ?) appear without  previous answers alongside the new answer
		
		
		System.out.println("Now what shall your fuzzy range start with?");
		while (!fuzzyScanner.hasNextInt()) {
			System.out.println("A little too fuzzy... try again");
			fuzzyScanner.next();
		}
		input3 = fuzzyScanner.nextInt();
		
		System.out.println("And what shall your fuzzy range end with?");
		while (!fuzzyScanner.hasNextInt()) {
			System.out.println("Fuzzy range too fuzzy; please try again");
			fuzzyScanner.next();
		}
		range = fuzzyScanner.nextInt();
		
		fuzzyScanner.close(); //MUST have close... or else this repeats, unprettily
		
		
		for(; input1 <= range; input1++) {//edification; was initialized, condition, increment
			if(input1 % 3 == 0 && input1 % 5 == 0) {
				System.out.println("fizzbuzz");}
			else if(input1 % 3 == 0) {
				System.out.println("fizz");
			}
			else if (input1 % 5 == 0){
				System.out.println("buzz"); //there is no buzz ..o.o  ever....there is now
			}
			else {
				System.out.println(input1);
				
				
				
				
			}
		}		
	}
}
