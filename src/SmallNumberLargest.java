
public class SmallNumberLargest {
    
    public static void main(String[] args) {
        
        int a[]=new int[]{20,32,45,2,55,12,200,60,65,90,8,30};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
              min=a[i];  
            }
        }
        System.out.println("Largest number is:"+max);
        System.out.println("Smallest number is:"+min);
    }
    
}
