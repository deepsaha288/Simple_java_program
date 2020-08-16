import java.io.*;
import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        
        int rem,rev=0,temp,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:" );
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            
        }
        if(n==rev)
        {
            System.out.println("Number  is palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
    }
    
}
