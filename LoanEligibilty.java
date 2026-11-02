import java.util.*;
public class LoanEligibilty
    {
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("enter the salary and Age:");
                int Age=sc.nextInt();
                Long Salary=sc.nextLong();
                if(Age>=20 && Salary>=30000)
                    {
                        System.out.println("Loan Approved!");
                    }
            }
    }