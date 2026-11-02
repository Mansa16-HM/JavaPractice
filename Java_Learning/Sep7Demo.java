    class Sep7Demo
    {
        public static void main(String args[])
            {
            /* for(int i=1;i<=10;i++)
                {
                
                     if(i==5)
                         break; 
                    System.out.println(i);              
                } */
               int sum=0;
               for(int i=0;i<=20;i++)
               {
                int fibbo=0;
                sum=fibbo+i;
                fibbo=fibbo+sum;
                System.out.println(sum);
               }
            }
    }