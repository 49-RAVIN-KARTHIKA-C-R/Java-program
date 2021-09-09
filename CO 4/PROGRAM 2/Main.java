import Arithmetic.*;
public class Main{
   public static void main(String []args){
      Arithmetic a=new Arithmetic();
      System.out.println("Addition of two numbers:" +a.add(11,12));
      System.out.println("Subtraction of two numbers:"+a.sub(32,10));
      System.out.println("Multiplication of two numbers:"+ a.mul(21,1));
      System.out.println("Division of two numbers:"+a.div(45,5));      
   }
}