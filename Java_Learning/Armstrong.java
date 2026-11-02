/* import java.util.*;
    public class Armstrong
    {
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Number:");
                int Num=sc.nextInt();
                int temp=Num;
                int result=0;
                int sum=0;
                int Armstrong=0;
                    while(Num>0)
                        {
                            
                            result=Num%10;
                            sum=result*result*result*result;
                            Armstrong=Armstrong+sum;
                            Num=Num/10;
                            
                        }
                        if(Armstrong==temp)
                        {
                            System.out.println("its a armstrong number");
                        }
                        else
                        {
                            System.out.println("its a not armstrong number");
                        }

            }
    } */
   import java.util.*;

public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int Num = sc.nextInt();

        int temp = Num;
        int count = 0;
        int Armstrong = 0;

        while (temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        temp = Num;

        while (temp > 0)
        {
            int digit = temp % 10;
            Armstrong = Armstrong + (int)Math.pow(digit, count);
            temp = temp / 10;
        }

        if (Armstrong == Num)
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }
    }
}