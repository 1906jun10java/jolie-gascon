
public class FizzBuzz {
	
	int input1;
	int input2;
	int input3;
	int range;
	
	public FizzBuzz ( int input2, int input3, int range) {
	
	this.input2 = input2;
	this.input3 = input3;
	this.range = range;
	
	}
	public FizzBuzz() {
		// TODO Auto-generated constructor stub
	}
	public void fizzBuzzBasic() {
		for(input1= 1; input1<=range;input1++) {
			if(input1%3 == 0 && input1%5 == 0) {
				System.out.println("fizzbuzz");}
			else if(input1%3 == 0) {
				System.out.println("fizz");
			}
			else if (input1%5 == 0){
				System.out.println("buzz"); // yay!  I'd had a red line here forever, or it just wouldn't
											// display buzz... I know this isn't the properly completed assignment
											//and took me forever, but I did this much without error, on my own 
											// ultimately
			}
			else {
				System.out.println(input1);
			}
		}
	}
			

	public static void main(String[] args) {
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.fizzBuzzBasic();
		
		/*public void fizzBuzzAdvanced() {
			for(multiple3=1; multiple3<=range;multiple3++) {
				if(multiple3%multiple5 == 0 && multiple3%multiple3and5 == 0) {
					System.out.println("fizzbuzz");}
				else if(multiple3%multiple3and5 == 0) {
					System.out.println("fizz");
				}
				else if (multiple3%multiple5 == 0){
					System.out.println("buzz");
				}
				else {
					System.out.println(multiple3);
				}*/
			}
		
		
	}


