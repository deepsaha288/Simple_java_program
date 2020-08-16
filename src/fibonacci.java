import java.io.*;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int value1=0,value2=1,sum,c=10;
        System.out.print(value1+" " +value2);
        for(int i=1;i<c;++i)
        {
            sum=value1+value2;
            System.out.println("\n"+sum);
            value1=value2;
            value2=sum;
        }
    }
    
}
