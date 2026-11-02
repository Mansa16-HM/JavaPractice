class Swap3NumWithoutExtraMemory
{  
    public static void main(String args[])
{
    /*int First_Value=10;
        int Second_Value=20;
        int Third_Value=30;
        int Four_Value=12;
        First_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;
 Second_Value = First_Value^  Second_Value ^ Third_Value ^ Four_Value;     
Third_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;      
Four_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;     
First_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;
      // a gets original d
      System.out.println("First_Value  "+First_Value );
      System.out.println("Second_Value "+Second_Value);
      System.out.println("Third_Value  "+Third_Value);
      System.out.println("Four_Value   "+Four_Value);*/

      //Long Swapping

     /* long First_Value=1097;
        long Second_Value=2065;
        long Third_Value=3032;
        long Four_Value=1232;
        First_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;
 Second_Value = First_Value^  Second_Value ^ Third_Value ^ Four_Value;     
Third_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;      
Four_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;     
First_Value = First_Value ^  Second_Value ^ Third_Value ^ Four_Value;
      // a gets original d
      System.out.println("First_Value  "+First_Value );
      System.out.println("Second_Value "+Second_Value);
      System.out.println("Third_Value  "+Third_Value);
      System.out.println("Four_Value   "+Four_Value);*/

      // No extra Memory Usage 
      int a=1;
      int b=2;
      int c=4;
      int d=4;


      a = a + b + c + d;
b = a - b - c - d  ;    // b gets original a
c = a - b - c - d ;     // c gets original b
d = a - b - c - d ;      // d gets original c
a = a - b - c - d ;     // a gets original d
  
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);


}
}