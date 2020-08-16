
import java.util.Scanner;


public class LastString {
    public static void main(String[] args) {
        
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        s=sc.nextLine();
        s=s.trim();
        System.out.println("last latter of string is:"+s.charAt(s.length()-1));
        
        
    }
    
}
