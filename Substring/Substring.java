//wanna figure out scanner for this later
import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {

		System.out.println("Enter a sentence of your choice!"); 

		Scanner scanner = new Scanner(System.in);
		String actualString = "";
		String substring = "";
		actualString = scanner.nextLine();
		System.out.println("Enter your snippet!"); 
		substring = scanner.nextLine();

		
		
	  System.out.println(substring(actualString, substring));
		scanner.close();

		
	}
	public static boolean substring(String actualString, String substring) {

		// boolean maybeSubstring = actualString.contains("ard"); //using contains()
		// method, may not be usable on
		// Java earlier than 1.5
		// case-sensitive
		if (actualString.contains(actualString.substring(3, 8)) == substring.contains(actualString.substring(3, 8))) {
			System.out.println("Tested original string" + actualString);
			System.out.println("Checking for" + "ard");
			System.out.println("Answer found" + "yup");

			return true;
		} else {
			System.out.println("Failure mode we're dun");
			return false;
		}
	}

}
