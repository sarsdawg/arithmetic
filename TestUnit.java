
public class TestUnit {

	public static void main(String[] args) {
		
		// Test the Arithmetic.convert method.
		System.out.println("Test the convert method:");
		System.out.println();
		// Test binary to octal.
		System.out.println("Test the conversion of the binary number 11001 to octal.  The result should be 31.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)2, (byte)8, "11001"));
		System.out.println();
		// Test octal to hex.
		System.out.println("Test the conversion of the octal number 34646 to hexadecimal.  The result should be 39A6.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)8, (byte)16, "34646"));
		System.out.println();
		// Test hex to binary.
		System.out.println("Test the conversion of the hexadecimal number 1AF to binary.  The result should be 110101111.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)16, (byte)2, "1AF"));
		System.out.println();
		// Test bad inBase
		System.out.println("Test the input of a bad input base 3.  The result should be an error.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)3, (byte)16, "34646"));
		System.out.println();
		// Test bad outBase
		System.out.println("Test the input of a bad output base 17.  The result should be an error.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)8, (byte)17, "34646"));
		System.out.println();
		// Test base, number mismatch
		System.out.println("Test a mismatched base 2 and number 1AF.  The result should be an error.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)2, (byte)16, "1AF"));
		System.out.println();
		// Test bad number input
		System.out.println("Test a bad number of 7ZG.  The result should be an error.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.convert((byte)16, (byte)2, "7ZG"));
		System.out.println();
		
		// Test the add method.
		System.out.println(); 
		System.out.println("Test the add method:");
		System.out.println();
		// Test binary + binary.
		System.out.println("Test the binary addition of 110 and 101.  The result should be 1011.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.add((byte)2, "110", "101")); 
		System.out.println(); 
		// Test octal + octal.
		System.out.println("Test the octal addition of 52 and 71.  The result should be 143.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.add((byte)8, "52", "71")); 
		System.out.println(); 
		// Test decimal + decimal.
		System.out.println("Test the decimal addition of 159 and 23.  The result should be 182.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.add((byte)10, "159", "23")); 
		System.out.println(); 
		// Test hex + hex.
		System.out.println("Test the hexadecimal addition of 1F and 2AD.  The result should be 2CC.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.add((byte)16, "1F", "2AD")); 
		System.out.println(); 
		
		// Test the floatAdd method.
		System.out.println(); 
		System.out.println("Test the floatAdd method:");
		System.out.println();
		System.out.println("Test the addition of 1.5 and 5490.3459.  The result should be 5491.8459.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatAdd("1.5", "5490.3459")); 
		System.out.println(); 
		
		// Test the subtract method.
		System.out.println();
		System.out.println("Test the subtract method:");
		System.out.println();
		System.out.println("Test 11100 - 1010 in binary.  The result should be 10010.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.subtract((byte)2, "11100", "1010")); 
		System.out.println(); 
		System.out.println("Test 5-10 in decimal.  The result should be -10.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.subtract((byte)10, "5", "10")); 
		System.out.println(); 
		
		// Test the floatSubtract method.
		System.out.println(); 
		System.out.println("Test the floatSubtract method:");
		System.out.println();
		System.out.println("Test 6829.1023 - 345.310.  The result should be 6483.7923.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatSubtract("6829.1023", "345.310")); 
		System.out.println(); 
		System.out.println("Test -50.2 - 23.35.  The result should be -73.55.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatSubtract("-50.2", "23.35")); 
		System.out.println(); 
		
		// Test the multiply method.
		System.out.println();
		System.out.println("Test the multiply method:");
		System.out.println();
		System.out.println("Test 77 multiplied by 32 in octal.  The result should be 3146.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.multiply((byte)8, "77", "32")); 
		System.out.println();
		
		// Test the floatMultiply method.
		System.out.println(); 
		System.out.println("Test the floatMultiply method:");
		System.out.println();
		System.out.println("Test 54.789 multiplied by 4612.12.  The result should be 252693.44268.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatMultiply("54.789", "4612.12")); 
		System.out.println(); 
		
		//Test the divide method
		System.out.println();
		System.out.println("Test the divide method:");
		System.out.println();
		System.out.println("Test 100 divided by 20 in decimal.  The result should be 5.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.divide((byte)10, "100", "20")); 
		System.out.println();
		System.out.println("Test 100 divided by 21 in decimal.  The result should be 4.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.divide((byte)10, "100", "21")); 
		System.out.println();
		
		// Test the floatDivide method.
		System.out.println(); 
		System.out.println("Test the floatDivide method:");
		System.out.println();
		System.out.println("Test 100 divided by 21.  The result should be 4.7619....");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatDivide("100", "21")); 
		System.out.println();
		
		//Test the squareRoot method
		System.out.println();
		System.out.println("Test the squareRoot method:");
		System.out.println();
		System.out.println("Test the square root of 190 in hexadecimal.  The result should be 14.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.squareRoot((byte)16, "190")); 
		System.out.println();
		System.out.println("Test the square root of 1F4 in hexadecimal.  The result should be 16.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.squareRoot((byte)16, "1F4")); 
		System.out.println();
		
		// Test the floatSquareRoot method.
		System.out.println(); 
		System.out.println("Test the floatSquareRoot method:");
		System.out.println();
		System.out.println("Test the square root of 500.  The result should be 22.36067....");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatSquareRoot("500")); 
		System.out.println();
		
		// Test the exponent method.
		System.out.println();
		System.out.println("Test the exponent method:");
		System.out.println();
		System.out.println("Test 1001 raised to the 11 power in binary.  The result should be 1011011001.");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.exponent((byte)2, "1001", "11")); 
		System.out.println();
		
		// Test the floatExponent method.
		System.out.println(); 
		System.out.println("Test the floatExponent method:");
		System.out.println();
		System.out.println("Test 56.2 raised to the 1.567 power.  The result should be 551.8700258...");
		System.out.print("The result is: ");
		System.out.println(Arithmetic.floatExponent("56.2", "1.567")); 
		System.out.println();
	}

}
