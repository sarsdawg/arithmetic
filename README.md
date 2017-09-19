# arithmetic

This is a reusable arithmetic library, written in Java.

To use this library, include the compiled Arithmetic.class file with your other Java binary files.  You can also compile it yourself via the Arithmetic.java source code file, if you wish.

This repository also includes a TestUnit.class file with a main() method to show a walkthrough testing of the library's correct functionality.  The TestUnit.java source code is also present.

This library is intended to be widely reuasable due to its ability to perform basic arithmetic operations on binary, octal, decimal, hexadecimal, and floating point numbers.  It also performs conversions between the various types.  All input for number values, regardless of type, is taken as a String.  All output is given as a String as well.  Base values (binary, octal, decimal, hexadecimal) are represented as the numbers 2, 8, 10, and 16, respectively, and are passed as the primitive Java byte type.  All functions return an error if there is an invalid base, a mismatch between the given base and one of the arguments, or invalid characters in any of the arguments.

Methods included in this library are:

String convert(byte inBase, byte outBase, String arg)      
Converts between binary, octal, decimal, and hexadecimal.

String add(byte base, String arg1, String arg2)
Adds binary, octal, decimal, or hexadecimal numbers.  Negative numbers are not indicated.  To show negative results or use negative arguments, use decimal-based floating point numbers with the floatAdd method.

String floatAdd(String arg1, String arg2)
Adds floating point numbers.  

String subtract(byte base, String arg1, String arg2)
Subtracts binary, octal, decimal, or hexadecimal numbers.  Negative numbers are not indicated.  To show negative results or use negative arguments, use decimal-based floating point numbers with the floatSubtract method.

String floatSubtract(String arg1, String arg2)
Subtracts floating point numbers.

String multiply(byte base, String arg1, String arg2)
Multiplies binary, octal, decimal, or hexadecimal numbers.  Negative numbers are not indicated.  To show negative results or use negative arguments, use decimal-based floating point numbers with the floatMultiply method.

String floatMultiply(String arg1, String arg2)
Multiplies floating point numbers.

String divide(byte base, String arg1, String arg2)
Divides binary, octal, decimal, or hexadecimal numbers.  Negative numbers are not indicated.  To show negative results or use negative arguments, use decimal-based floating point numbers with the floatDivide method.

String floatDivide(String arg1, String arg2)
Divides floating point numbers.

String squareRoot(byte base, String arg)
Finds the square root of binary, octal, decimal, or hexadecimal numbers.

String floatSquareRoot(String arg)
Finds the square root of a floating point number.

String exponent(byte base, String arg, String power)
Finds the value of a binary, octal, decimal, or hexadecimal number raised to a power in the same base.  Negative numbers are not indicated.  To show negative results or use negative arguments, use decimal-based floating point numbers with the floatExponent method.

String floatExponent(String arg, String power)
Finds the value of floating point number raised to a power indicated by another floating point number.
