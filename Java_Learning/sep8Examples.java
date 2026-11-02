import java.util.*;
    public class sep8Examples
        {
            public static void main(String args[])
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the Start and Stop:");
                    int Start=sc.nextInt();
                    int Stop=sc.nextInt();
                   // int count=0;
                    /* for(int i=Start;i<=Stop;i++)
                    {
                            for(int j=Start;j<=Start;j++)
                                {
                                  ++count;
                                  System.out.print(count    +" ");
                                }
                                System.out.println();
                    } */
                    int count=0;
             for(int i=Start;i<=Stop;i++)
    {
        for(int j=Start;j<=i;j++)
        {
            ++count;
            System.out.print(count+" ");
            }
            System.out.println();

            }}
                        
                    
                            

                }
        