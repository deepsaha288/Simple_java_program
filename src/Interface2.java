


interface Animals
{
    public void eat();
    public void  run();
    
}
class Dog implements Animals
{
    public void eat()
    {
        System.out.println("Dog can eat meat every day");
    }
    public void run()
    {
        System.out.println("Dog always run very fast");
    }
    public void sleep()
    {
        System.out.println("my Dog sleep every night 10pm ");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.run();
        d.sleep();
    }
    
}
