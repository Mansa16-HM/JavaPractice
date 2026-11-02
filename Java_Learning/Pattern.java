public class Pattern
   
    {
        public static void main(String args[])
            {
           // Scanner sc=new Scanner(System.in);
            /* System.out.println("enter the Number");
            int Num=sc.nextInt();
            int a=0,b=1,c;
                 int i=0;
                /*  System.out.println(a+" \n"+b);
                for(int i=0;i<=Num-2;i++)
                    {

                    c=a+b;
                    System.out.println(c);
                    a=b;
                    b=c; */
                // System.out.println(a+" \n"+b);
             /* do
              {
                 System.out.println(a+" \n"+b);
                 c=a+b;
                    System.out.println(c);
                    a=b;
                    b=c; 
              }
              while(i<Num-2);
            }
    }
     */
    /* Golden rule:
    ------------------
    any loop can be nested 
    outer loop is rows
    inner loop is colunms 
    concept remains loop inside the inner loop 
    nestinf controls how repetation occurs  */
     
   /*  for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            System.out.print(i+j);
        }
        System.err.println( );
    }
 *//*  int count=0;
             for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            ++count;
            System.out.print(count+" ");
            }
            System.out.println();
    } */

   /* for(int i=1;i<=5;i++)
    {
        for(int j=1;j<i;j++)
        {
            System.out.print("*");
            }

            System.out.println();
    } */
/* int count=0;
             for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            ++count;
            System.out.print(count+" ");
            }
            System.out.println();

            }} */

           for(int i = 1; i <= 5; i++) {       // Count UP
    for(int j = 1; j <= i; j++) {
        System.out.print((6 - i) + " ");  // Print (6-i)
    }
    System.out.println();
}
            }
           }
    