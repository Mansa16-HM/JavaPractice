import java.util.*;
    public class sep8Examples
        {
            public static void main(String args[])
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the Start and Stop:");
                    int Start=sc.nextInt();
                    int Stop=sc.nextInt();
                    int count=0;
                    for(int i=1;i<=5;i++)
                    {
                            for(int j=0;j<=i;j++)
                                {
                                  ++count;
                                  System.out.println(j+"");

                                }
                                System.out.println();
                    }
                    
                        
                    
                            

                }
        }