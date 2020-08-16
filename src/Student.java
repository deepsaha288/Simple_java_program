import java.io.*;
import java.util.*;
public class Student 
{
 
    int roll_no;
     String name;
    static String College_name="Sams";
}
class StaticDemo
{
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.roll_no=100;
        s1.name = "deep";
        System.out.println(s1.roll_no);
        System.out.println(s1.name);
        System.out.println(Student.College_name);
        Student s2=new Student();
        s2.roll_no=200;
        s2.name="sano";
        System.out.println(s2.roll_no);
        System.out.println(s2.name);
        System.out.println(Student.College_name);
    }
}