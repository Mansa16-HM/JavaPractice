import java.util.*;
public class SeniorCitizenEligibility
    {
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the age");
                int age = sc.nextInt();
                if(age>=60)
                    {
                        System.out.println("Senior Citizen");
                    }
                else
                    {
                        System.out.println("Not a Senior Citizen");
                    }
            }
    }