public class Sumavg{
public static void main(String [] args){
int sum=0;
int[] num ={2,4,12,10,7};
for(int i:num)
{
sum+=i;
}
System.out.println("Sum of the numbers are:\n"+ sum);
int avg=sum/5;
System.out.println("Average of the numbers are:\n"+ avg);
}
}