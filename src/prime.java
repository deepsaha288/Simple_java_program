import java.io.*;
import java.util.*;
public class prime {
    public static void main(String args[])
    {
       int c=0,n;
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if((n%i)==0)
                c=c+1;
        }
        if(c==2)
        
            System.out.print("Number is prime");
        
        else
            System.out.println("Number is not prime");
        
        
    }
}
