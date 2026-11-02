import java.util.*;
public class examResult
    {
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out .println("enter the marks u obtained");
                int marks=sc.nextInt();
                if(marks>=35)
                    {
                        System.out.println("U passed the exam!");
                    }
                else
                    {
                        System.out.println("U are failed!");
                    }
            }
    }