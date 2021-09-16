// Write a user defined exception class to authenticate the user name and password.

import java.util.*;
class authusername extends Exception{
  authusername(String s)
  {
    super(s);
  }
}

class authpassword extends Exception{
 authpassword(String s)
 {
   super(s);
 }
}

class authenticuser{
public static void main(String  args[]){
 String username,password;
 try{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the UserName:");
       username=sc.nextLine();
       System.out.println("Enter the Password:");
       password=sc.nextLine();
       if(!username.equals("Ravin"))
              throw new authusername("Incorrect UserName.....");
       else if(!password.equals("ravin"))
              throw new authpassword("Incorrect Password.....");
       else
               System.out.println("\t\t Successfull.......");
      }
     catch(authusername e){
                 System.out.println(e);
     }
     catch(authpassword e){
                 System.out.println(e);
     }
     finally{
                 System.out.println("\t\t Program Ends..... ");
}
}
}