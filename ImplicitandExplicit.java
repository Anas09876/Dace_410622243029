package anas;

public class ImplicitandExplicit { public static void main(String[] args) {
    // Declaration and initialization of primitive types
    boolean boolValue = true;
    byte byteValue = 100;
    char charValue = 'A';
    short shortValue = 500;
    int intValue = 1000;
    long longValue = 10000000L;
    float floatValue = 35.14f;
    double doubleValue = 7.14159;

    // Implicit and explicit type casting
    // Implicit casting (widening conversions)
    int widenedIntValue = byteValue;// byte can be assigned to int
    long widenedLongValue = intValue; // int can be assigned to long
    float widenedFloatValue = longValue; // long can be assigned to float
    double widenedDoubleValue = floatValue; // float can be assigned to double

    // Explicit casting (narrowing conversions)
    byte narrowedByteValue = (byte) intValue; // int is explicitly cast to byte
    short narrowedShortValue = (short) longValue; // long is explicitly cast to short
    int narrowedIntValue = (int) floatValue; // float is explicitly cast to int
    long narrowedLongValue = (long) doubleValue; // double is explicitly cast to long

    // Printing the Initial values
    System.out.println("Initial values:");
    System.out.println("boolean: " + boolValue);
    System.out.println("byte: " + byteValue);
    System.out.println("char: " + charValue);
    System.out.println("short: " + shortValue);
    System.out.println("int: " + intValue);
    System.out.println("long: " + longValue);
    System.out.println("float: " + floatValue);
    System.out.println("double: " + doubleValue);

    System.out.println();

    System.out.println("Implicit and explicit type casting:");
    System.out.println("Implicit casting (widening conversions):");
    System.out.println("byte to int: " + widenedIntValue);
    System.out.println("int to long: " + widenedLongValue);
    System.out.println("long to float: " + widenedFloatValue);
    System.out.println("float to double: " + widenedDoubleValue);

    System.out.println();

    System.out.println("Explicit casting (narrowing conversions):");
    System.out.println("int to byte: " + narrowedByteValue);
    System.out.println("long to short: " + narrowedShortValue);
    System.out.println("float to int: " + narrowedIntValue);
    System.out.println("double to long: " + narrowedLongValue);
}
}
