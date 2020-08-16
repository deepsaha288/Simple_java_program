
public class SelactionSort {
    public static void main(String[] args) {
        String a[]={"deep","mohan","tulshi","ajoy"};
        int min;
        System.out.println("before sorting a name");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
             if(a[j].compareTo(a[min])<0)
             {
                 min=j;
             }
            }
            String temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("After the sorting");
        for(int i=0;i<a.length;i++)
        {   
            
            System.out.println(a[i]);
        }
    }
    
}
