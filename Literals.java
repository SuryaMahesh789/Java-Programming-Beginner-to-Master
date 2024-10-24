import java.lang.*;
import java.util.Scanner;
import java.util.*;


class SizeRangeOfDataTypes
{

    public static void main(String arg[])
    {
       
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0xA;


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
        
        long l1=125;
        long l2=125l;
        long l3=125L;
        // long l4=99999999999;
        
        long l4=99999999999L;

        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        // float f1=125.56;
        float f2=125.56f;
        
        // System.out.println(f1);
        System.out.println(f2);
        
        double d1=125.56;
        double d2=125.56d;

        System.out.println(d1);
                System.out.println(d2);


        

    }
}