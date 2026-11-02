import java.util.*;
public class UserLogin
    {
public static void main(String args[])
    {
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the user name:");
     String userName=S.nextLine();
     System.out.println("enter the Password:");
     String Password=S.nextLine();

     if(userName.equals("admin") && Password.equals("java123"))
        {
            System.out.println("Login successfully!");
        }
      else 
        {
            System.out.println("Login failed!");
        }

    }
}