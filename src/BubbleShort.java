
public class BubbleShort {
    public static void main(String[] args) {
     
        int temp,size;
        int[] a={20,30,40,60,75,85};
        size=a.length;
        System.out.println("Before all number ares:");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=5;i<size;i++)
        {
            for(int j=0;j<size;j++)
                
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("after the searching third largest number:");
        for(int i=5;i<a.length;i++)
        {
            System.out.println("the third largest no is:"+a[size-3]);
        }
    }
  }
    

