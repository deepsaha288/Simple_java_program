import java.util.*;
import java.io.*;
 
public class LargeAndSmall 
{
 public static void main(String[] args)
    { 
        int[] arr=new int[]{700,5,20}; 
          int lar=arr[0];
          int small=arr[0];
          for(int i=1;i<arr.length;i++)
          {
              if(arr[i]>lar)
              {
                 lar=arr[i];
                 
              }
               if(arr[i]<small)
              {
                  small=arr[i];
              }
              System.out.println("the large number is"+ lar);
              System.out.println("the small number is"+ small);
          }
  
    }
}
   