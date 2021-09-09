package Arithmetic;
interface arithmetic_interface{
   public float add(int a,int b);
   public float sub(int a,int b);
   public float mul(int a,int b);
   public float div(int a,int b);
}
public class Arithmetic implements   arithmetic_interface{
    public float add(int a,int b){
       return a+b;   
    }
    public float sub(int a,int b){
        return a-b;
    }
    public float mul(int a,int b){
        return a*b;
    }
    public float div(int a,int b){
        return a/b;
    }
}