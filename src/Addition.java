import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Addition {

    public static void main(String[] args) {

        System.out.println("Enter the two array size..");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] one= new int[size],two = new int[size];
        System.out.println("Enter the array elements of Array-One");
        for (int i = 0; i <size; i++) {
            one[i]=input.nextInt();
        }
        System.out.println("Enter the array elements of Array-Two");
        for (int i = 0; i <size; i++) {
            two[i]=input.nextInt();
        }
        Addition(one,two);

    }

    private static void Addition(int[] one, int[] two){
        System.out.print("Array One"+"\t");
        for (int i = 0; i <one.length; i++) {
        System.out.print(one[i] + "\t");
        }
        System.out.println();
        System.out.print("Array Two"+"\t");
        for (int i = 0; i <two.length; i++) {
        System.out.print(two[i]+ "\t");
        }
        System.out.println();
        System.out.println("---------------------");
        int result[]=new int[one.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=one[i]+two[i];
        }
        System.out.println("Sum Of Two Arrays ");
        System.out.print(" Sum "+"\t"+"\t");
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }
    }
}