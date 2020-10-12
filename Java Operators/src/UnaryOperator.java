/*
***Notes***
The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.:

incrementing/decrementing a value by one
negating an expression
inverting the value of a boolean
*/

public class UnaryOperator {

	public static void main(String[] args) {
		
		// JAVA Unary Operator Example: ++ and --
		
		int x=10;
		boolean b = true;
		
		System.out.println("Original Value of x: " + x);
		System.out.println("x++ : " + x++);	// 10 (11)  
		
		System.out.println("++x : " + ++x);	// 12  
		
		System.out.println("x-- : " + x--);	// 12 (11)  
		
		System.out.println("--x : " + --x);	// 10
		
		System.out.println("x++ + ++x : " + (x++ + ++x));		// 10+12=22 
		
		System.out.println("x-- + --x : " + (x-- - --x));		// 12-10=2 
		
		//Java Unary Operator Example: ~ and !
		
		System.out.println("~x: " + ~x);	// -3 (Negation: Minus of total positive values (+ve values starts from 0))
		
		System.out.println("!b : " + !b);	// false (inversion of a boolean value)
		
	}
}
