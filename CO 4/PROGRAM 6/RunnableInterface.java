// Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface)

import java.util.*;
import java.lang.*;
class fibonacci implements Runnable
{
    
    public void run()
    {
        int a=0;
        int b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("No fibonacci series");

        }
        else if(n==1)
        {
            System.out.println("----------FIBONACCI SERIES-----------");
            System.out.println(a);
        }
        else if(n==2)
        {
            System.out.println("----------FIBONACCI SERIES------------");
            System.out.print(a+"  ");
            System.out.print(b+"  ");
        }
        else
        {
            System.out.println("-----------FIBONACCI SERIES------------");
            System.out.print(a+"  ");
            System.out.print(b+"  ");
        
            for(int i=1;i<=(n-2);i++)
            {
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+"  ");
            }
        }
    }
    
}
class even implements Runnable
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial range : ");
        int initial=sc.nextInt();
        System.out.println("Enter the boundary range : ");
        int boundary=sc.nextInt();
        for (int i=initial;i<=boundary;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"  ");
            }
        }

    }
}

class RunnableInterface
{
    public static void main(String args[]) {
        fibonacci f=new fibonacci();
        even e=new even();
        Thread T1=new Thread(f);
        Thread T2=new Thread(e);
        T1.start();
        T2.start();
    }
}