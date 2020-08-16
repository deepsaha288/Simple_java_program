
public class BubbleSort {
     public static void main(String[] args) {
        String a[]={"suraj","deep","anup","raj"};
         System.out.println("Before sorting string");
         for(int i=0;i<a.length;i++)
         {
             System.out.println(a[i]+" ");
         }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                  String temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                }
            }
        }
        System.out.println("After the sorting string");
         
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    
}
