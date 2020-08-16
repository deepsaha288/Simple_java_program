import java.io.*;
import java.util.*;
public class ThirdLargestNumber {
    public static void main(String[] args) {
        int temp,size;
        int array[]={10,20,70,63,96,57,80,75,85};
        size=array.length;
        //Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the number:");
       // size=sc.nextInt();
        for(int i=0;i<size;i++)
                {
                  for(int j=0;j<size;j++)
                  {
                      if(array[i]>array[j])
                      {
                          temp=array[i];
                          array[i]=array[j];
                          array[j]=temp;
                      }    
                  }
                }
        System.out.println("Third latgesr number is:"+array[size-3]);
    }
    
}
