
public class Encapsulation 
{
    private int empid;
    static String Company_name="Deep Software";
    public void SetEmpid(int eid)
    {
        empid=eid;
    }
    public int GetEmpid()
    {
        return empid;
    }
}
class company{
    public static void main(String[] args)
    {
       Encapsulation e=new Encapsulation();
       e.SetEmpid(101);
        System.out.println(e.Company_name);
       System.out.println("Employee Id is:"+e.GetEmpid());
    }
    
}
