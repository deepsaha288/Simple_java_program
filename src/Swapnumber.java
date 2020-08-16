import java.io.*;
import java.util.*;
public class Swapnumber {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=sc.nextInt();
        System.out.println("enter the value of b:");
        b=sc.nextInt();
         System.out.println("Before swapping -a: "+ a);
          System.out.println("Before swapping -b: "+ b);
         int temp;
         temp=a;
         a=b;
         b=temp;
          System.out.println("After swapping -a: "+ a);
           System.out.println("After swapping -b:"+ b);
    }
}
