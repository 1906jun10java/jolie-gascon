
public class TriangleWithRecursion {

	public static void main(String[] args) {
	
	System.out.println(Triangle(2));
}
	
public static int Triangle(int base) { //triangle I hope?
		
		if (base == 1) {
			return base;
		} else {
			return base + Triangle(base-1); 
	
}

}

}