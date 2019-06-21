import java.util.Scanner;

public class PalindromeReverseRecursion {
	
		public static void main(String[] args) {
			
				System.out.println("Please enter a thingy to reverse!"); //reversing starts here
				
				Scanner scannerReverse = new Scanner(System.in);
						String string = scannerReverse.nextLine();
						
						StringBuilder stringbuilder = new StringBuilder(string); 
						//StringBuilder is a function to work
						//marvelously well with reverse function 
						//to reverse  strings; it makes for modifiable
						//strings
						
						
						System.out.println("Your string; reverse: "); //reverse function reverses the
																		//characters in a stringbuilder
																		//function
						System.out.println(stringbuilder.reverse().toString());//toString method is used 
																				//when we need a string
																				//representation of an
																				//object. It is defined 
																				//in Object class. 
						scannerReverse.close();
			

			System.out.println("Enter a sentence of your choice!"); //palindrome basic starts here

			Scanner scanner = new Scanner(System.in);
			String phraseInput = "";
			phraseInput = scanner.nextLine();

		  System.out.println(isPalindrome(phraseInput));
			scanner.close();

		}
		
		
		public static boolean isPalindrome(String phraseInput) {

				int check = 0;

				boolean sentence = true;

				if (phraseInput == null || phraseInput.isEmpty()) {
					sentence = false;
				} 
				else {
					int length = phraseInput.length();
					phraseInput = phraseInput.toLowerCase(); //wanting mixed case palindromes to still count 
					while (check <= length / 2) {
						if (phraseInput.charAt(check) != phraseInput.charAt(length - 1 - check)) {
							sentence = false;
							System.out.println("This is not a palindrome; however...not-Woo");

						}
						check = check + 1;

					}

				}
				return sentence;

				}

	}



