public class ArithmeticOperations {
    public static void main(String[] args) {
        
        // 1. byte + byte -> int (byte is promoted to int)
        byte byte1 = 10, byte2 = 20;
        int resultByte = byte1 + byte2;
        System.out.println("byte + byte = int: " + resultByte); // 30

        // 2. short + int -> int
        short shortNum = 100;
        int intNum = 200;
        int resultShortInt = shortNum + intNum;
        System.out.println("short + int = int: " + resultShortInt); // 300

        // 3. int + long -> long (int is promoted to long)
        long longNum = 100000L;
        long resultIntLong = intNum + longNum;
        System.out.println("int + long = long: " + resultIntLong); // 100200

        // 4. long + float -> float (long is promoted to float)
        float floatNum = 12.5f;
        float resultLongFloat = longNum + floatNum;
        System.out.println("long + float = float: " + resultLongFloat); // 100012.5

        // 5. float + double -> double (float is promoted to double)
        double doubleNum = 3.14159;
        double resultFloatDouble = floatNum + doubleNum;
        System.out.println("float + double = double: " + resultFloatDouble); // 15.64159

        // 6. char + int -> int (char is promoted to int based on ASCII value)
        char charA = 'A'; // ASCII value of 'A' is 65
        int resultCharInt = charA + intNum;
        System.out.println("char + int = int: " + resultCharInt); // 265

        // 7. byte + char -> int (both byte and char are promoted to int)
        byte byteValue = 5;
        int resultByteChar = byteValue + charA;
        System.out.println("byte + char = int: " + resultByteChar); // 70

        // 8. boolean + any type (Invalid, results in compilation error)
        // boolean boolVal = true;
        // int invalidResult = boolVal + intNum;  // Compilation error

        // 9. Mixed Operations
        double mixedResult = (byte1 * floatNum) + (intNum / doubleNum) - longNum;
        System.out.println("Mixed operation result = " + mixedResult); 
    }
}
