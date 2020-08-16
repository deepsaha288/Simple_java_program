import java.io.*;
import java.util.*;
public class Greather {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Three number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c) 
        {
            System.out.print("a is graether");
            
        }
            else if(b>a && b>c)
                    {
                    System.out.print("b is greather");
                    
                    }
        else
            {
                System.out.print("c is greather");
                
         }
    }
    
}
