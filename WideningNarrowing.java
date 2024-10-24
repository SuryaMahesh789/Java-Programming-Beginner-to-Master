public class WideningNarrowing {
    public static void main(String[] args) {
        // Widening Conversion (Implicit)
        byte byteValue = 10;                     // 1 byte
        short shortValue = byteValue;            // byte to short
        int intValue = shortValue;               // short to int
        long longValue = intValue;               // int to long
        float floatValue = longValue;            // long to float
        double doubleValue = floatValue;         // float to double

        System.out.println("Widening Conversion:");
        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Narrowing Conversion (Explicit)
        doubleValue = 9.78;                      // double value
        floatValue = (float) doubleValue;        // double to float (narrowing)
        longValue = (long) floatValue;           // float to long (narrowing)
        intValue = (int) longValue;              // long to int (narrowing)
        shortValue = (short) intValue;           // int to short (narrowing)
        byteValue = (byte) shortValue;           // short to byte (narrowing)

        System.out.println("\nNarrowing Conversion:");
        System.out.println("double to float: " + floatValue);
        System.out.println("float to long: " + longValue);
        System.out.println("long to int: " + intValue);
        System.out.println("int to short: " + shortValue);
        System.out.println("short to byte: " + byteValue);
    }
}
