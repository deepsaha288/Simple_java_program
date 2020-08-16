import java.io.*;
import java.util.*;
 interface My
 {
   public void maxSpeed();
   public void minSpeed();
   
 }
class Bus implements My
{
    @Override
    public void maxSpeed()
    {
           System.out.println("maximum speed of bus is 160");
}
    @Override
    public void minSpeed()
{
    System.out.println("minimum speed of bus is 40");
}
public void AvgSpeed()
{
    System.out.println("Avarage speed of bus is 65");
}
}


public class Myinterface {
    public static void main(String[] args)
    {
     Bus b=new Bus();
     b.maxSpeed();
     b.minSpeed();
     b.AvgSpeed();
      /*My mi;
      mi=new Bus();
      mi.maxSpeed();
      mi.minSpeed();*/
      
     
    }
    
}
