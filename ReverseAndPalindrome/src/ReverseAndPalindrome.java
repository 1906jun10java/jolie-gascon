import java.util.Scanner;

public class ReverseAndPalindrome {
	
	public static void main(String[] args) {//whyyyyyy are we green
		
		System.out.println("Enter a sentence of your choice!");
		
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





	

