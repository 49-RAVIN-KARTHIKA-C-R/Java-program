// Now, volume() returns the volume of a box.
class Box 
 {
 double width;
 double height; 
double depth;
// compute and return volume
 double volume() 
{ 
return width * height * depth;
 }
}
class Pgm4
 {
 public static void main(String args[])
 {
 Box mybox1 = new Box();
 Box mybox2 = new Box();
 double vol;

// assign values to mybox1's instance variables

mybox1.width = 5; 
mybox1.height = 10; 
mybox1.depth = 15;

/* assign different values to mybox2's instance variables */

mybox2.width = 2; 
mybox2.height = 4;
 mybox2.depth = 6;

// get volume of first box

 vol = mybox1.volume();
 System.out.println("Volume is " + vol);

// get volume of second box 
vol = mybox2.volume(); 
System.out.println("Volume is " + vol);
}
}