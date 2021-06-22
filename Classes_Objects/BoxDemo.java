/* A program that uses the box class.*/

class Box
{
  double width;
  double height;
  double depth;
}
class BoxDemo
{
 public static void main(String args[])
 {
    Box mybox=new Box();
    double vol;
    mybox.width=5;
    mybox.height=10;
    mybox.depth=15;
    vol=mybox.width*mybox.height*mybox.depth;
    System.out.println("Volume is " +vol);
 }
}
