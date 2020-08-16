import java.io.*;
import java.util.*;
public class AlphabeticallySort {
 
    public static void main(String[] args) {
        String S="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        sc.close();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
           for(int j=0;j<ch.length;j++)
           {
              if(ch[i]<ch[j])
              {
                 char temp=ch[i];
                  ch[i]=ch[j];
                  ch[j]=temp;
              }
           }
        }
        for(int k=0;k<ch.length;k++)
        {
         S=S+ch[k];
        }
        System.out.println("our sorted string is:" +S);
    }
    
}
