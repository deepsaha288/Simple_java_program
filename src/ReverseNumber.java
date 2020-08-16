import java.io.*;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        
        int n, rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        n=sc.nextInt();
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print(rev);
    }
    
}
