import java.io.*;
import java.util.*;
public class shape {
    public static void main(String[] args) {
      for(int i=1;i<=4;i++)
      {
          for(int j=1;j<=i;j++)
          {
              if(i>=2 && j<=i-1)
              {
                  System.out.print(" ");
              }
              else
              {
                    System.out.println(" * ");  
              }
              
          }
      
     
        System.out.println();
    }
}
}