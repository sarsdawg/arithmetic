import java.util.ArrayList;
import java.util.List;

public class Arithmetic {
	
	// Converts from one base to another.
	public static String convert(byte inBase, byte outBase, String arg) {
		if (!baseCheck(inBase) || !baseCheck(outBase) || !argCheck(inBase, arg)) {
			return "Error.  There was a problem with the given input base, output base, "
					+ "and/or number to convert.  Please use one of the following values "
					+ "for a base: 2, 8, 10, 16.  Also, please ensure that the value of "
					+ "the number to convert is entered in the same base as the input base."; 
		}
		long a = convertToDecimal(inBase, arg);
		String result = convertFromDecimal(outBase, a);
		return result;
	}
	
	/* Adds two whole binary, octal, decimal, or hexadecimal numbers of a common base, 
	 * and returns a result in the same base as a string.
	 */
	public static String add(byte base, String arg1, String arg2) {
		if (!baseCheck(base) || !argCheck(base, arg1) || !argCheck(base, arg2)) {
			return "Error.  There was a problem with the given given base and/or numbers "
					+ "to add.  Please use one of the following values as a base: 2, 8, "
					+ "10, 16.  Also, please ensure that the values of the numbers to add "
					+ "are entered in the same base as indicated.";
		}
		String result = "";
		long a = convertToDecimal(base, arg1);
		long b = convertToDecimal(base, arg2);
		long c = a+b;
		result = convertFromDecimal(base, c);
		return result;
	}
	
	/* Adds two floating point (decimal-based) numbers, and returns a floating point 
	 * value as a string.
	 */
	public static String floatAdd(String arg1, String arg2) {
		if (!floatCheck(arg1) || !floatCheck(arg2)) {
			return "Error.  There was a problem with the given numbers to add.  "
					+ "Please use decimal-based numbers and a '.' to indicate the decimal point. ";
		}
		String result = "";
		double a = Double.valueOf(arg1);
		double b = Double.valueOf(arg2);
		double c = a+b;
		result = String.valueOf(c); 
		return result;
	}
	
	/* Subtracts two whole binary, octal, decimal, or hexadecimal numbers of a common 
	 * base, and returns a result in the same base as a string.
	 */
	public static String subtract(byte base, String arg1, String arg2) {
		if (!baseCheck(base) || !argCheck(base, arg1) || !argCheck(base, arg2)) {
			return "Error.  There was a problem with the given given base and/or numbers "
					+ "to subtract.  Please use one of the following values as a base: 2, "
					+ "8, 10, 16.  Also, please ensure that the values of the numbers to "
					+ "subtract are entered in the same base as indicated.";
		}
		String result = "";
		long a = convertToDecimal(base, arg1);
		long b = convertToDecimal(base, arg2);	
		long c = a-b;
		result = convertFromDecimal(base, c);
		return result;
	}
	
	/* Subtracts two floating point (decimal-based) numbers, and returns a floating point 
	 * value as a string.
	 */
	public static String floatSubtract(String arg1, String arg2) {
		if (!floatCheck(arg1) || !floatCheck(arg2)) {
			return "Error.  There was a problem with the given numbers to subtract.  "
					+ "Please use decimal-based numbers and a '.' to indicate the decimal point. ";
		}
		String result = "";
		double a = Double.valueOf(arg1);
		double b = Double.valueOf(arg2);
		double c = a-b;
		result = String.valueOf(c); 
		return result;
	}
	
	/* Multiplies two whole binary, octal, decimal, or hexadecimal numbers of a common 
	 * base, and returns a result in the same base as a string.
	 */
	public static String multiply(byte base, String arg1, String arg2) {
		if (!baseCheck(base) || !argCheck(base, arg1) || !argCheck(base, arg2)) {
			return "Error.  There was a problem with the given given base and/or numbers "
					+ "to multiply.  Please use one of the following values as a base: 2, "
					+ "8, 10, 16.  Also, please ensure that the values of the numbers to "
					+ "multiply are entered in the same base as indicated.";
		}
		String result = "";
		long a = convertToDecimal(base, arg1);
		long b = convertToDecimal(base, arg2);	
		long c = a*b;
		result = convertFromDecimal(base, c);
		return result;
	}
	
	/* Multiplies two floating point (decimal-based) numbers, and returns a floating point 
	 * value as a string.
	 */
	public static String floatMultiply(String arg1, String arg2) {
		if (!floatCheck(arg1) || !floatCheck(arg2)) {
			return "Error.  There was a problem with the given numbers to multiply.  "
					+ "Please use decimal-based numbers and a '.' to indicate the decimal point. ";
		}
		String result = "";
		double a = Double.valueOf(arg1);
		double b = Double.valueOf(arg2);
		double c = a*b;
		result = String.valueOf(c); 
		return result;
	}
	
	/* Divides two whole binary, octal, decimal, or hexadecimal numbers of a common base, 
	 * and returns a result in the same base as a string.  Note that the result can only 
	 * be a whole number.
	 */
	public static String divide(byte base, String arg1, String arg2) {
		if (!baseCheck(base) || !argCheck(base, arg1) || !argCheck(base, arg2)) {
			return "Error.  There was a problem with the given given base and/or numbers to "
					+ "divide.  Please use one of the following values as a base: 2, 8, 10, "
					+ "16.  Also, please ensure that the values of the numbers to divide are "
					+ "entered in the same base as indicated.";
		}
		String result = "";
		long a = convertToDecimal(base, arg1);
		long b = convertToDecimal(base, arg2);	
		long c = a/b;  // division of two longs returns a whole number
		result = convertFromDecimal(base, c);
		return result;
	}
	
	/* Divides two floating point (decimal-based) numbers, and returns a floating point value 
	 * as a string.
	 */
	public static String floatDivide(String arg1, String arg2) {
		if (!floatCheck(arg1) || !floatCheck(arg2)) {
			return "Error.  There was a problem with the given numbers to divide.  "
					+ "Please use decimal-based numbers and a '.' to indicate the decimal point. ";
		}
		String result = "";
		double a = Double.valueOf(arg1);
		double b = Double.valueOf(arg2);
		double c = a/b;
		result = String.valueOf(c); 
		return result;
	}
	
	/* Determines the square root of a binary, octal, decimal, or hexadecimal number, and 
	 * returns a result in the same base as a string.  Note that the result can only 
	 * be a whole number.
	 */
	public static String squareRoot(byte base, String arg) {
		if (!baseCheck(base) || !argCheck(base, arg)) {
			return "Error.  There was a problem with the given given base and/or number to "
					+ "find the square root of.  Please use one of the following values as "
					+ "a base: 2, 8, 10, 16.  Also, please ensure that the value of the "
					+ "number to find the square root of is entered in the same base as indicated.";
		}
		String result = "";
		long a = convertToDecimal(base, arg);	
		double c = Math.sqrt(a);
		result = convertFromDecimal(base, (long)c); // type-cast to long and lose float precision
		return result;
	}
	
	/* Determines the square root of a floating point (decimal-based) number, and returns 
	 * a floating point value as a string.
	 */
	public static String floatSquareRoot(String arg) {
		if (!floatCheck(arg)) {
			return "Error.  There was a problem with the given number to find the square root of.  "
					+ "Please use decimal-based numbers and a '.' to indicate the decimal point. ";
		}
		String result = "";
		double a = Double.valueOf(arg);
		double c = Math.sqrt(a);
		result = String.valueOf(c); 
		return result;
	}
	
	/* Determines the exponential value of a binary, octal, decimal, or hexadecimal number 
	 * raised to a power in the same base, and returns result in the same base as a string. 
	 */
	public static String exponent(byte base, String arg, String power) {
		if (!baseCheck(base) || !argCheck(base, arg) || !argCheck(base, power)) {
			return "Error.  There was a problem with the given given base, number to find "
					+ "the exponential value of, and/or the exponent.  Please use one of the "
					+ "following values as a base: 2, 8, 10, 16.  Also, please ensure that "
					+ "the value of the number to find the exponential value of, as well as "
					+ "the exponent, are entered in the same base as indicated.";
		}
		String result = "";
		long a = convertToDecimal(base, arg);
		long b = convertToDecimal(base, power);
		double c = Math.pow(a, b);
		result = convertFromDecimal(base, (long)c); // type-cast to long and lose float precision 
		return result;
	}
	
	/* Determines the exponential value of a floating point (decimal-based) number raised to 
	 * a floating point power, and returns a floating point value as a string. 
	 */
	public static String floatExponent(String arg, String power) {
		if (!floatCheck(arg) || !floatCheck(power)) {
			return "Error.  There was a problem with the given number to find the exponential "
					+ "value of, or with the given exponent.  Please use decimal-based numbers "
					+ "and a '.' to indicate the decimal point. ";
		}
		String result = "";
		double a = Double.valueOf(arg);
		double b = Double.valueOf(power);
		double c = Math.pow(a, b);
		result = String.valueOf(c); 
		return result;
	}
	
	// Check base input to ensure binary(2), octal(8), decimal(10), or hexadecimal(16).
	private static boolean baseCheck(byte base) {
		if (base != 2 && base != 8 && base != 10 && base != 16) return false;
		else return true;
	}
	
	// Check string input to ensure that it parses as a the indicated base type.
	private static boolean argCheck(byte base, String arg) {
		int len = arg.length();
		char c;
		for (int i=0; i<len; i++) {
			c = arg.charAt(i);
			switch (base) {
				case (2) : 
					if (c != '0' && c != '1') return false;
					break;
				case (8) :
					if (c != '0' && c != '1' && c != '2' && c != '3' &&
					    c != '4' && c != '5' && c != '6' && c != '7') return false;
					break;
				case (10) :
					if (c != '0' && c != '1' && c != '2' && c != '3' &&
				        c != '4' && c != '5' && c != '6' && c != '7' &&
				        c != '8' && c != '9') return false;
					break;
				case (16) : 
					if (c != '0' && c != '1' && c != '2' && c != '3' &&
					    c != '4' && c != '5' && c != '6' && c != '7' &&
					    c != '8' && c != '9' && c != 'a' && c != 'A' &&
						c != 'b' && c != 'B' && c != 'c' && c != 'C' &&
						c != 'd' && c != 'D' && c != 'e' && c != 'E' &&
						c != 'f' && c != 'F') return false;
					break;
				default :
					return false;
			} 
		} 
		return true;
	}
	
	// Check string input to ensure that it parses as a floating point number (decimal-based).
	private static boolean floatCheck(String arg) { 
		int len = arg.length();
		char c;
		for (int i=0; i<len; i++) {
			c = arg.charAt(i);
			if (c != '0' && c != '1' && c != '2' && c != '3' &&
			    c != '4' && c != '5' && c != '6' && c != '7' &&
			    c != '8' && c != '9' && c != '.' && c != '-') return false;
		}
		// check for a decimal point with nothing after it:
		if (arg.charAt(len-1) == '.') return false;
		// check for multiple decimal points:
		boolean dPoint = false;
		for (int i=len-2; i>=0; i--) {
			if (dPoint == true) 
				if (arg.charAt(i) == '.') return false;
			if (arg.charAt(i) == '.')
				dPoint = true;
		}
		//check for improperly placed '-'
		for (int i=len-1; i>=0; i--) {
			if (arg.charAt(i) == '-' && i!=0) return false;
		}
		return true;
	}
	
	// Convert number of type binary, octal, decimal, or hexadecimal to decimal.
	private static long convertToDecimal(byte base, String arg) {
		long result = 0;
		int len = arg.length();
		int j = len-1;
		byte jVal = 0;
		for (int i=0; i < len; i++) {
			jVal = (byte)Character.getNumericValue(arg.charAt(j));				
			result = result + (int)(jVal*Math.pow(base,i));
			j--;
		}
		return result;
	}
	
	// Convert number of type decimal to binary, octal, decimal, or hexadecimal.
	private static String convertFromDecimal(byte base, long arg) {
		List<Character> chars = new ArrayList<Character>(); 
		byte mod = 0;
		char modChar;
		do {
			mod = (byte)(arg % base);
			modChar = Character.forDigit(mod, base);
			arg = arg / base;
			chars.add(modChar);
		} while (arg >= base);
		if(arg>0) {
			modChar = Character.forDigit((byte)arg, base);
			chars.add(modChar);
		}
		// reverse character array:
		int s = chars.size();
		List<Character> chars2 = new ArrayList<Character>();
		for (int i=s-1; i>=0; i--) {
			chars2.add(chars.get(i)); 
		}
		String result = "";
		// convert to string:
		for (int i=0; i<s; i++) {
			result = result + Character.toString(chars2.get(i)); 
		}
		return result;
	}
	
}
