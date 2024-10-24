import java.lang.*;
import java.util.Scanner;
import java.util.*;


class Input
{

    public static void main(String arg[])
    {
        System.out.println("Hello World");

        Scanner s=new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter 2 Integers");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;

        System.out.print(c);
        
        System.out.println("Enter normal String");
        String sstr=s.next();
        System.out.print(sstr);

        System.out.println("Enter Space Seperated String");
        String str=s.nextLine();
        System.out.print(str);
        
        
        System.out.println("Enter Float");
        
        float f=s.nextFloat();
        System.out.println(f);
        
        
        System.out.println("Enter Byte");
        byte by=s.nextByte();
        System.out.println(by);
        
        System.out.println("Enter Short");
        short sh=s.nextShort();
        System.out.println(sh);

    }
}