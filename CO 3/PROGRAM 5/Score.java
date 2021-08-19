//5. Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display the academic and sports score of a student. 

import java.util.*;

interface Student
{
void Acd(String name,int rno,float m1,float m2,float percentage);
}

interface Sports
{
void Sps(String item,int rank);
}

class Results implements Student, Sports{
 String name,item;
 int rno,rank;
 float m1,m2,percentage;

 
 public void Acd(String name,int rno,float m1,float m2,float percentage)
 {
  this.name=name;
   this.rno=rno;
   this.m1=m1;
   this.m2=m2;  
   this.percentage=percentage;
 }
  public void Sps(String item,int rank)
 {
  this.item=item;
  this.rank=rank;
   }
 void display()
 {
   System.out.println("-------ACADEMIC DATA-------------");
   System.out.println("Name:" +name);
   System.out.println("RollNo:" +rno);
   System.out.println("Mark 1:" +m1);
   System.out.println("Mark 2:" +m2);
   System.out.println("Percentage:" +percentage);
   System.out.println("-------SPORTS DATA-------------");
   System.out.println("Item:" +item);
   System.out.println("Rank:" +rank);
 }
}
 class Score
{
  public static void main(String args[]){
  Scanner  sc=new Scanner(System.in);
  Results r=new Results();
   System.out.println("Enter the name:");
   String name=sc.next();
   System.out.println("Enter the rollno:");
   int rno=sc.nextInt();
   System.out.println("Enter the mark1:");
   float m1=sc.nextFloat();
   System.out.println("Enter the mark2:");
   float m2=sc.nextFloat();
   float percentage=((m1+m2)/200)*100f;
   System.out.println("Enter the item:");
   String item=sc.next();
   System.out.println("Enter the rank:");
   int rank=sc.nextInt();

  r.Acd(name,rno,m1,m2,percentage);
  r.Sps(item,rank);
  r.display();
 }
}