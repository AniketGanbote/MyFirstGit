/*
***Notes:***
	
	The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.
	e.g : 10<<2 (00001010 <<2 00101000) = 40
	The Java right shift operator >> is used to move left operands value to right by the number of bits specified by the right operand.
	e.g : 10>>2 (00001010 <<2 00000010) = 2
	For negative number, >>> changes parity bit (MSB) to 0  

*/

public class ShiftOperator {

	public static void main(String[] args) {
		
		// Java Left Shift Operator
		System.out.println("Right Shift Example --------");
		
		System.out.println("10<<0 : " + (10<<1)); // 10*2^1 => 10*2 = 20
		
		System.out.println("10<<2 : " + (10<<2)); // 10*2^2 => 10*4 = 40
		
		System.out.println("10<<3 : " + (10<<3)); // 10*2^3 => 10*8 = 80
		
		// Java Right Shift Operator
		System.out.println("\nLeft Shift Example --------");
		
		System.out.println("100>>2 : " + (100>>1)); // 100/2^1 => 100/2 = 50
		
		System.out.println("100>>2 : " + (100>>2)); // 100/2^2 => 100/4 = 25
		
		System.out.println("100>>3 : " + (100>>3)); // 100/2^3 => 100/8 = 12
		
		// Bitwise Zero Fill Right Shift Operator (>>>) Example
		System.out.println("\n>>> Shift Example --------");
		
		System.out.println("-20>>2 : " + (-20>>2));
		
		System.out.println("-20>>>2 : " + (-20>>>2));

	}

}
