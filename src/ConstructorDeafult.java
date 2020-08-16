import java.io.*;
import java.util.*;

class Students
{
int roll;
float marks;
String name;
void show()
{

System.out.println("Roll: "+roll);
System.out.println("Marks: "+marks);
System.out.println("Name: "+name);
}
}

public class ConstructorDeafult {
public static void main(String [] args)
{
Students s1=new Students();
s1.show();
}
}
    

