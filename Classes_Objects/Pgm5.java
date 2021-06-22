/* Here, Box uses a constructor to initialize the dimensions of a box. */
 
class Box
 { 
double width; 
double height;
 double depth;

// This is the constructor for Box. 
Box() 
{

 width = 8;
 height = 4; 
depth = 2;
 }

// compute and return volume 
double volume() 
{ 
return width * height * depth;
 }
}
class Pgm5
 {
 public static void main(String args[])
 {
 // declare, allocate, and initialize Box objects
 Box mybox1 = new Box();
 Box mybox2 = new Box();
double vol;

// get volume of first box
 vol = mybox1.volume(); 
System.out.println("Volume of first box is " + vol);

// get volume of second box
 vol = mybox2.volume();
 System.out.println("Volume of second box is  " + vol);
}
}