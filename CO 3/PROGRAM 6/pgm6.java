//6. Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects. 

import java.util.Scanner;
interface objects
{
  public void area();
  public void perimeter();
}

class circle implements objects
{
  int r;
  float a,p;
  public void area()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the radius:");
   r=sc.nextInt();
   a=3.14f*r*r;
   }
   public void perimeter()
   {
     p=2*3.14f*r ;
     System.out.println("Perimeter of the circle  : "+p);
      System.out.println("Area of the circle  : "+a);

    }

}

class rectangle implements objects
{

    int l,b;
    float a,p;
    
    public void area()
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the length of the rectangle  : ");
    l=sc.nextInt();
    System.out.println("Enter the breadth of the rectangle  : ");
    b=sc.nextInt();
    a=l*b;
    }
    public void perimeter()
    {
        p=2*l*b;
        System.out.println("Perimeter of Rectangle  : "+p);
        System.out.println("Area of Rectangle  : "+a);
    }

}

class pgm6
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\n----------MENU----------\n");
        System.out.println("\t1. Circle\n\t2. Rectangle\n");
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:objects t1=new circle();
            	t1.area();
            	t1.perimeter(); 
            	break;
            case 2:objects t2=new rectangle();
            	t2.area();
            	t2.perimeter(); 
            	break;
            default:System.out.println("Enter valid choice......  ");
	break;
        }
    }
}
