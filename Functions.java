public class Functions
    {
        public static void main(String args[])
            {
                int number=100;
                number= makeItHalf(number);
               System.out.println(number);

                number= makeItHalf(number);
               System.out.println(number);

               // int number2=20;
                
                //System.out.println(number2);
                data newdata=new data(); //obj
                newdata.number=100;
              
              makeItHalf_v2(newdata);
              System.out.println(newdata.number);
 
            

               // int result=makeItHalf(12);
            }//pass by value
            public static int makeItHalf(int num)
                {
                  num=num/2;
                  return num;  
                }

            public static int makeItHalf_v2 ( data newdata)
                {
                  newdata.number=newdata.number/2; 
                  return newdata.number; 
                }
    }