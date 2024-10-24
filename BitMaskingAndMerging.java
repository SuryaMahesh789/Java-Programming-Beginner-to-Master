public class BitMaskingAndMerging {
    public static void main(String[] args) {
        // Sample integers for demonstration
        int num1 = 0b11001100; // 204 in decimal
        int num2 = 0b00110011; // 51 in decimal

        // Print original numbers
        System.out.println("Original num1: " + Integer.toBinaryString(num1));
        System.out.println("Original num2: " + Integer.toBinaryString(num2));

        // 1. Bit Masking
        // Create a mask to set the last 4 bits (mask = 0b00001111)
        int maskSet = 0b00001111;
        int resultSet = num1 | maskSet; // Set bits
        System.out.println("\nSet Last 4 Bits: " + Integer.toBinaryString(resultSet));

        // Create a mask to clear the last 4 bits (mask = 0b11110000)
        int maskClear = ~maskSet; // Invert the mask to clear bits
        int resultClear = num1 & maskClear; // Clear bits
        System.out.println("Clear Last 4 Bits: " + Integer.toBinaryString(resultClear));

        // Create a mask to toggle the last 4 bits (mask = 0b00001111)
        int resultToggle = num1 ^ maskSet; // Toggle bits
        System.out.println("Toggle Last 4 Bits: " + Integer.toBinaryString(resultToggle));

        // 2. Merging Two Numbers
        // Define a mask to merge the two numbers (mask = 0b11110000 for num1)
        int maskMerge = 0b11110000; // Keep upper 4 bits of num1

        // Merge num1 and num2 using the mask
        int mergedResult = (num1 & maskMerge) | (num2 & ~maskMerge);
        System.out.println("\nMerged Result: " + Integer.toBinaryString(mergedResult));
        
        // Print decimal value of merged result
        System.out.println("Merged Result (Decimal): " + mergedResult);
    }
}
