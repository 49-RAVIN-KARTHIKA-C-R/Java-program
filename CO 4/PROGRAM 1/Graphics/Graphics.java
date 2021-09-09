package Graphics;
interface graphics_interface{
      public void rectanglearea(int l,int b);
      public void trianglearea(int l,int h);
      public void squarearea(int a);
      public void circlearea(int r);
}
public class Graphics implements graphics_interface{
       public void rectanglearea(int l,int b){
          System.out.println("Area of rectangle: " +l*b);
       }
       public void trianglearea(int l,int h){
          System.out.println("Area of triangle:" +(l*h)/2);
       }
       public void squarearea(int a){
          System.out.println("Area of square: " +a*a);
       }
       public void circlearea(int r){
          System.out.println("Area of circle: " +3.14*r*r);
       }
}