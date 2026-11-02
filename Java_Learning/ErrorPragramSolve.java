public class ErrorPragramSolve
{
    //case sensitive
    //public static void main(string args[])
    public static void main(String args[])
    {
          
        
       /*  //Syntax error 
        int a=10;
        System.out.println("a")
 */
 int a=10;
        System.out.println("a");
        //semantic error
       /*  int l=10,b=20;
        int area=2*(l*b);
        System.out.println(area);
 */
 int l=10,b=20;
        int area=(l*b);
        System.out.println(area);

        //Type mismatch 

       /*  int L=100.8;
        System.out.println(L); */
        
        double a9=10.5;
       // int b9=a9(int);

        int L=100;
        System.out.println(L);

        float   L1=100.8f;
        System.out.println(L);


        //Wrong Method

      /*  int h=8976;
       System.out.printline(h);
 */

      // Return type mismatch
      /* static int add(){
        return "Hello"; */

}
        //Duplicate Error
       /*  int age1=25;
        int age1=56;
        System.out.println(age1); */
        int age1=25;
        int age2=56;
        System.out.println(age1);
        System.out.println(age2);

     

     //Local Variable error
     /* byte Z;
     System.out.println(Z); */
     byte Z=120;
     System.out.println(Z);


     //curly braces not used

     int add,a=10,b=30;
     add=a+b;
     {
 System.out.println("Added Value"+add);
     }

}
     }
      
