
public class ascending {
    public static void main(String[] args)
    {
        int a[]={30,60,10,40,20,50};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                //if(a[i]<a[j])//descending order apply we can change here//
                if(a[i]>a[j]) //ascending order apply this //
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println("Ascending order Array is: "+a[i]);
        }
        
    }
    
}
