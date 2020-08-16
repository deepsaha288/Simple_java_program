import java.io.*;
import java.util.*;

class  Std
{
 int m1,m2;
 String name;

 void getmarks(int x,int y)
 {
     m1=x;
     m2=y;
 }
 void putmarks()
 {
     System.out.println("name:"+name);
     System.out.println("java mark:" +m1);
     System.out.println("Database mark:"+m2);
    
 }
}
interface InternalMarks
{
    int sp=15;
    void spmarks();
}
class Result extends Std implements InternalMarks
{
    public void spmarks()
    {
        System.out.println("InternalMarks:"+sp);
    }
    void display()
    {
      putmarks();
      spmarks();
      int total=m1+m2+sp;
        System.out.println("Total Marks=" +total);
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        
        Result r=new Result();
        r.name ="deep";
        r.getmarks(67, 75);
        r.display();
    }
}
