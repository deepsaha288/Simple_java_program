
public class Star13 
{
 
    public static void main(String [] args) 
    {
        int[] array={1,2,2,5,5,5,5,3,3,3,4,4,6,7,8,9,10};
        sortByCount(array);
    }
    static int elementsCount(int ar[],int n)
    {
        int count=0;
        for(int i:ar)
        {
            int max=n;
            if(i==max)
            {
                count++;
            }
            max=i;
        }
        return count;
    }
    static void sortByCount(int ar[])
    {
        int temp=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(elementsCount(ar,ar[i])>elementsCount(ar,ar[j]))
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        printArray(ar);
    }
    static void printArray(int[]ar)
    {
        for(int i:ar)
        {
        System.out.println(i);
    }
    }
}