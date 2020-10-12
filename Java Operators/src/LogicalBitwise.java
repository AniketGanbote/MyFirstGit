
public class LogicalBitwise {

	public static void main(String[] args) {
		
		// Logical && VS Bitwise &
		
		int n1 = 10, n2 = 5, n3 = 20;
		
		System.out.println("------------------------------");
		
		System.out.println("Logical AND (&&) VS Bitwise AND (&)");
		
		// Logical AND (&&) // Stops if 1st condition is false
		System.out.println("\n (n1<n2) && (n1++<n3) : " + (n1<n2 && n1++ < n3));
		
		System.out.println(" value of (n1) : " + n1);
		
		// Bitwise AND (&) // Always checks both the conditions
		System.out.println("\n (n1<n2) & (n1++<n3) : " + (n1<n2 & n1++ < n3));
		
		System.out.println(" value of (n1) : " + n1);
		
		// Logical OR (||) VS Bitwise OR (|)
		System.out.println("------------------------------");
		
		System.out.println("Logical OR (||) VS Bitwise OR (|)");
		
		// Logical OR (|) // doesn't check second condition if first condition is true
		System.out.println("\n (n1<n2) || (n1++<n3) : " + (n1<n2 || n1++ < n3));
		
		System.out.println(" value of (n1) : " + n1);
		
		// Bitwise OR (|) // Always checks both the conditions
		System.out.println("\n (n1<n2) | (n1++<n3) : " + (n1<n2 | n1++ < n3));
		
		System.out.println(" value of (n1) : " + n1);

	}

}
