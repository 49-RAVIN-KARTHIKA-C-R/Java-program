import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array_reverse_buffer{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array:"); 
        int size=Integer.parseInt(read.readLine());
        int[] arr=new int [size];
        System.out.print("Enter elements of array:");
        System.out.print("\n");    
        for(int i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(read.readLine());
        }
        System.out.print("Array elements are:"); 
        System.out.print("\n"); 
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+"\n"); 
        }
    }
} 