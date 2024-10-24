public class Swapping {
    public static void main(String[] args) {
        // Sample integers for demonstration
        int a = 12; 
        int b = 24;
        System.out.println(a);
        System.out.println(b);
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        
        System.out.println(a);
        System.out.println(b);

    }
}
