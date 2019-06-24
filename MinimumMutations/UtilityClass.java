import java.util.Scanner;

public class UtilityClass {

	public static void main(String[] args) {
		
		System.out.println("Please enter 8-character long ATCG gene code");
		Scanner scanner = new Scanner(System.in);
		String startInput = "";
		
		startInput = scanner.nextLine();
		
		scanner.close();
		
		String end = "";
		String bank1 = "AACCGGTA";
		String bank2 = "AACCGCTA";
		String bank3 = "AAACGGTA";
		
		
		 
		boolean x = true;
		
		if ((startInput.contentEquals(bank1)) || (startInput.contentEquals(bank2)) || (startInput.contentEquals(bank3))) {//multiple or line in question
			System.out.println("Gene code: " + x);
		}else {
			System.out.println("nope");//depending on how I switch it up, it'll
									//either always run as true, or as false
			
									//..nevermind; I think I got it with .contentEquals! huzzah! 
		}
			
		/*I know I want to have user input of  a genetic 
		sequence of 8 characters with ATCG, and test the input 
		with what's in the bank, and then note the minimum number 
		of mutations needed to mutate from start to end (if none exist; 
		then return -1, and if the start and end are the same, return 0)
		... but I still don't know how to do that on my own just yet...
		still going to try hackerank for that extra practice (electricity 
		went twice this weekend, late at night when I usually settle down 
		for extra work, and for  a long time each
		 ...so...trying a very, very  rudimentary version of things...   
		this multiple or line of code is something Ricardo and I have been
		 playing with, and wanted to ask you about...
		so far it sorta works, but only always for one condition
		
		   .....but now I got it to work with .contentEquals :D*/
	
		
	}
}


