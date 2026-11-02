import java.util.*;
public class taxSlab
    {
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Tax Amount to paid to go");
        long tax_Amt=sc.nextLong();
        if(tax_Amt==1000000)
            {
                System.out.println("40% Tax!");
            }
        else if(tax_Amt>=90000)
            {
                System.out.println("35% Tax!"); 
            }
        else if(tax_Amt>=70000)
            {
                System.out.println("20% Tax!"); 
            }
        else
            {
             
                System.out.println("You are not a tax payer");   
            }
    }
    }