import java.util.Scanner;
public class Array_reverse{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int [10];
        System.out.print("Enter size of array:"); 
        int size= sc.nextInt();
        System.out.print("Enter elements of array:");
        System.out.print("\n");    
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are:"); 
        System.out.print("\n"); 
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+"\n"); 
        }
    }
} 