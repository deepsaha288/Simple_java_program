import java.io.*;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String Orginal;
        String rev="";
        System.out.println("Enter the String to Reverse");
        Scanner sc=new Scanner(System.in);
        Orginal=sc.nextLine();
        int len=Orginal.length();
        for(int i=len-1;i>=0;i--)
        {
         rev=rev+Orginal.charAt(i);
        }
        System.out.println("Orginal string is :"+Orginal);
         System.out.println("Reverse string is :"+rev);
    }
    
}
