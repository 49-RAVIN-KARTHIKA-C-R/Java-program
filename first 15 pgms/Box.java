class box{
double width;
double height;
double depth;
}
class Box{
public static void main(String args[]) {
box mybox=new box();
double vol;

mybox.width=10;
mybox.height=12;
mybox.depth=14;

vol=mybox.width +mybox.height+mybox.depth;
System.out.println("Volume is",vol);
}
}
