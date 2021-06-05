class product{
    int pcode;
    String pname;
    double price;
}
public class Lowprice{
    public static void main(String[] args) {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.pcode=111;
        p1.pname="Fridge";
        p1.price=10000;
        p2.pcode=112;
        p2.pname="A.C";
        p2.price=21000;
        p3.pcode=113;
        p3.pname="T.V";
        p3.price=13500;
       if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);

        }
        
      
    }
  }