public class ErrorPragram
{
    //case sensitive
    public static void main(string args[])
    {
        //Syntax error 
        int a=10;
        System.out.println("a")

        //semantic error
        int l=10,b=20;
        int area=2*(l*b);
        System.out.println(area);

        //Type mismatch 

        int L=100.8;
        System.out.println(L);

        //Wrong Method

       int h=8976;
       System.out.printline(h);

      // Return type mismatch
      static int add(){
        return "Hello";

        //Duplicate Error
        int age1=25;
        int age1=56;
        System.out.println(age1);
   
     //Local Variable error
     byte Z;
     System.out.println(Z);

     //curly braces not used

     int add,a=10,b=30;
     add=a+b;
 System.out.println("Added Value"+add);
     }


     }
      }
    }
}