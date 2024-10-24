public class OperatorDemo {
    public static void main(String[] args) {
        
        // 1. Arithmetic Operators (+, -, *, /, %)
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // 15
        System.out.println("a - b = " + (a - b));  // 5
        System.out.println("a * b = " + (a * b));  // 50
        System.out.println("a / b = " + (a / b));  // 2
        System.out.println("a % b = " + (a % b));  // 0

        // 2. Increment and Decrement Operators (++ and --)
        System.out.println("\nIncrement and Decrement Operators:");
        int x = 10;
        System.out.println("Initial x = " + x);
        System.out.println("x++ = " + (x++));  // 10 (post-increment)
        System.out.println("After x++: x = " + x);  // 11
        System.out.println("++x = " + (++x));  // 12 (pre-increment)
        System.out.println("x-- = " + (x--));  // 12 (post-decrement)
        System.out.println("After x--: x = " + x);  // 11
        System.out.println("--x = " + (--x));  // 10 (pre-decrement)

        // 3. Relational Operators (==, !=, >, <, >=, <=)
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));  // true
        System.out.println("a < b: " + (a < b));  // false
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a <= b: " + (a <= b));  // false

        // 4. Logical Operators (&&, ||, !)
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q));  // false
        System.out.println("p || q: " + (p || q));  // true
        System.out.println("!p: " + (!p));  // false
        System.out.println("!q: " + (!q));  // true

        // 5. Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
        int m = 6, n = 3;  // 6 = 110 in binary, 3 = 011 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n));  // 2 (010)
        System.out.println("m | n: " + (m | n));  // 7 (111)
        System.out.println("m ^ n: " + (m ^ n));  // 5 (101)
        System.out.println("~m: " + (~m));  // -7 (bitwise NOT)
        System.out.println("m << 1: " + (m << 1));  // 12 (left shift)
        System.out.println("m >> 1: " + (m >> 1));  // 3 (right shift)
        System.out.println("m >>> 1: " + (m >>> 1));  // 3 (unsigned right shift)

        // 6. Assignment Operators (=, +=, -=, *=, /=, %=)
        System.out.println("\nAssignment Operators:");
        int z = 10;
        System.out.println("Initial z = " + z);
        z += 5;  // z = z + 5
        System.out.println("z += 5: " + z);  // 15
        z -= 3;  // z = z - 3
        System.out.println("z -= 3: " + z);  // 12
        z *= 2;  // z = z * 2
        System.out.println("z *= 2: " + z);  // 24
        z /= 4;  // z = z / 4
        System.out.println("z /= 4: " + z);  // 6
        z %= 5;  // z = z % 5
        System.out.println("z %= 5: " + z);  // 1
    }
}
