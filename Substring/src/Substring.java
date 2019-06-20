//wanna figure out scanner for this later
public class Substring {

	public static void main(String[] args) {

	String actualString = "Hardcoding";
	String substring = "ard";
	
	substring(actualString, substring);
	}
	public static boolean substring(String actualString, String substring) {
		
		
		//boolean maybeSubstring = actualString.contains("ard");    //using contains() method, may not be usable on 
											//Java earlier than 1.5
												//case-sensitive
		if (actualString.contains(actualString.substring(1, 3))==  substring.contains(actualString.substring(1, 3))) {
			System.out.println("Tested original string" +actualString);
			System.out.println("Checking for" + "ard");
			System.out.println("Answer found" + "yup");
			
			return true;
		}else {
			System.out.println("Failure mode we're dun");
			return false;
		}
		
	}
	}



