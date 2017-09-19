# arithmetic

This is a reusable arithmetic library, written in Java.

To use this library, include the compiled Arithmetic.class file with your other Java binary files.  You can also compile it yourself via the Arithmetic.java source code file, if you wish.

This repository also includes a TestUnit.class file with a main() method to show a walkthrough testing of the library's correct functionality.

This library is intended to be widely reuasable due to the ability to perform basic arithmetic operations on binary, octal, decimal, hexadecimal, and floating point numbers.  It also performs conversions between the various types.

Methods included in this library are:

Returns  Method Name        Argument 1      Argument 2      Argument 3      Description
-------  -----------        ----------      ----------      ----------      -----------
String   convert            byte inBase     byte outBase    String arg      Converts between binary, octal, decimal, and hexadecimal.

String   add                byte base       String arg1     String arg2     Adds binary, octal, decimal, or hexadecimal numbers.

String   floatAdd           String arg1     String arg2                     Adds floating point numbers.

String   subtract           byte base       String arg1     String arg2     Subtracts binary, octal, decimal, or hexadecimal numbers.

String   floatSubtract      String arg1     String arg2                     Subtracts floating point numbers.

String   multiply           byte base       String arg1     String arg2     Multiplies binary, octal, decimal, or hexadecimal numbers.

String  floatMultiply       String arg1     String arg2                     Multiplies floating point numbers.

String  divide              byte base       String arg1     String arg2     Divides binary, octal, decimal, or hexadecimal numbers.

String  floatDivide         String arg1     String arg2                     Divides floating point numbers.

String  squareRoot          byte base       String arg                      Finds the square root of binary, octal, decimal, or                                                                                       hexadecimal numbers.
