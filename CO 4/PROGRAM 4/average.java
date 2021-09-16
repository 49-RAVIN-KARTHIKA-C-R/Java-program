// Find the average of N positive integers, raising a user defined exception for each negative input

import java.util.*;
class Negative extends Exception{
Negative(String s){
      super(s);
 }
}

class average{
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   float avg;
   int sum=0;
   int num;
   System.out.println("Enter the count of number : ");
   int count=sc.nextInt(); 
   try{
        System.out.println("Enter the elements : ");
        for(int i=0;i<count;i++)
        {
                num=sc.nextInt();
                if(num < 0)
                {
                    throw new Negative("Enter a positive number!!!");
                }
                else
                {
                    sum=sum+num;
                }
            }
        avg=(float)sum/count;
        System.out.println("sum:"+sum);
        System.out.println("Average of "+count+ " number is :"+avg);
        }
   catch(Negative e){
            System.out.println(e);
        }
     finally{
          System.out.println("\n \n Program Ends....");
     }
}
}