// Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)

import java.lang.*;
import java.util.*;
class multiplication extends Thread
{
public void run()
{
    for(int i=1;i<=10;i++)
    {
        System.out.println(i+" * 8= "+(i*8));        
    }
    try{  
        Thread.sleep(500);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    
}
class prime extends Thread
{
int num;

public void run()
{
   
    Scanner sc=new Scanner(System.in);
    System.out.println(" \n Count of first N prime numbers : ");
    int n=sc.nextInt();
    System.out.println("------ PRIME NUMBERS ARE ------");
    for(int i=2;i<100;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if (i%j==0)
            {
                count=count+1;
            }

        }
        if(count==2)
        {
            System.out.print(i+ "  ");
            num=num+1;

        }
        if (num==n)
        {
        break;
        }
    }
    try{  
        Thread.sleep(500);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
public class MainThread
{
    public static void main(String args[]) {
    multiplication m=new multiplication();
    prime p=new prime();
    m.start();
    p.start();
    }
}