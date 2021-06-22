// Now, volume() returns the volume of a box.

class Box 
 {
 double width;
 double height; 
double depth;

// Compute and return volume
 
double volume() 
{ 
return width * height * depth;
 }
}
class Pgm3
 {
 public static void main(String args[])
 {
 Box mybox1 = new Box();
 Box mybox2 = new Box();
 double vol;

//Assign values to mybox1's instance variables

 mybox1.width = 11; 
mybox1.height = 21; 
mybox1.depth = 13;

/* Assign different values to mybox2's instance variables */

mybox2.width = 4; 
mybox2.height = 8;
 mybox2.depth = 10;

// Get volume of first box

vol = mybox1.volume();
System.out.println("Volume is  " + vol);

//Get volume of second box 

vol = mybox2.volume(); 
System.out.println("Volume is  " + vol);
}
}