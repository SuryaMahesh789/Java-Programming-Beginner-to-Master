public class PrintStatementsExample {
    public static void main(String[] args) {
        // Variables to demonstrate printing
        int integerValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Hello, Java!";
        char charValue = 'J';
        boolean booleanValue = true;

        // 1. Using System.out.println() - prints with a new line
        System.out.println("Using println():");
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("String Value: " + stringValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

        // 2. Using System.out.print() - prints without a new line
        System.out.print("\nUsing print(): ");
        System.out.print("Integer: " + integerValue + ", ");
        System.out.print("Double: " + doubleValue + ", ");
        System.out.print("String: " + stringValue + ", ");
        System.out.print("Character: " + charValue + ", ");
        System.out.print("Boolean: " + booleanValue);
        
        // 3. Using System.out.printf() - formatted output
        System.out.printf("\n\nUsing printf():\n");
        System.out.printf("Integer: %d\n", integerValue);
        System.out.printf("Double: %.2f\n", doubleValue); // Format to 2 decimal places
        System.out.printf("String: %s\n", stringValue);
        System.out.printf("Character: %c\n", charValue);
        System.out.printf("Boolean: %b\n", booleanValue);
        
        float y=0.0012f;
        System.out.printf("Float: %f\n", y);
        System.out.printf("Float: %e\n", y);
        System.out.printf("Float: %g\n", y);
        
        System.out.printf("Boolean: %b\n", booleanValue);
        
        

        // 4. Using String.format() to create a formatted string
        String formattedString = String.format("Formatted String - Integer: %d, Double: %.2f", integerValue, doubleValue);
        System.out.println("\nUsing String.format():");
        System.out.println(formattedString);
    }
}
