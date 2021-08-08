// 1.Area of different shapes using overloaded functions

class shapes
{
    float pi=3.14f;
    int length,bredth,radius;

    void area(int radius)
    {
        System.out.println("Area of circle : "+(pi*radius*radius));
    }
    void area(int length,int bredth)
    {
        System.out.println("Area of rectangle : "+(length*bredth));

    }
}
class Overloading
{
    public static void main(String args[]) {
        shapes s=new shapes();
        s.area(2);
        s.area(5,10);
    
    }
}