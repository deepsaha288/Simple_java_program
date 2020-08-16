
public class Sortingstring {
    static String name[]={"deep", "sonu","anup","bikash"};
    public static void main(String[] args) {
        int size=name.length;
        String temp=null;
        System.out.println("before sorting name:");
        for(int i=0;i<size;i++)
        {
            System.out.println("\n \t" +name[i]);   
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
               if(name[i].compareTo(name[j])>0) 
               {
                   temp=name[i];
                   name[i]=name[j];
                   name[j]=temp;
               }
            }
        }
         System.out.println("After sorting name:");
        for(int i=0;i<size;i++)
        {
            System.out.println("\n \t" +name[i]);   
        }
    }
    
}
