import java.util.*;
class methodpower    
    {
     public static int power(int base,int exp){
            int result=1;
            for(int i=0;i< exp;i++)
                {
                    result*=base;
                }
                return result;
        }
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the value of X(base) and Y(exponent)");
                int x=sc.nextInt();
                int y=sc.nextInt();
                System.out.println(power(x,y));
                
        }
    }