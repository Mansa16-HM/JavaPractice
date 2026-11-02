public class typeConversions
{
    public static void main(String args[])
    {
        // Type promotion:Automatic conversion of smaller data type 
       // golden rules 
       /* 1: Byte , short, char are always promoted to int.... bfr arithmetic operation
2 If operands are of different types,  java promotes the smaller type to the widest type in the expression
3 The result of the epression is of that promoted data type */
      


      //Demo of byte and byte
      byte a=12;
      byte b=20;
      byte c=80;
        
    // byte d=a+b; --> wrong bcz Lossy conversion
     int d=a+b;
     System.out.println(d);

     short e=1;
    // byte f=e+a;-->wrong bcz Lossy conversion
      int f=e+a;
      System.out.println(f);

      long g=12343;
      // long h=b+g;-->wrong bcz Lossy conversion

      int h=a+b;
       System.out.println(h);

       short i=0;
       short j=(short)(i+e);//wrong bcz Lossy conversion
     // int j=i+e;
       System.out.println(j);

       long k=2345;
       long l=g+k;
       System.err.println(l);

      // short m=k+i; wromg because lossy conversion from long to short
      //int m=k+i;
      long m=k+i;
       System.out.println(m);

       long n=k+l;
       System.out.println(n);

char C_character1='A';
char C_character2='B';
int C_character3=C_character1+C_character2;
System.out.println(C_character3); // here by adding the 2 character when we store in the int that will store the ASCII value 

int e2 =12;
int e3=10;
int e4=e2+e3;
System.out.println(e4);

char c3='M';
int i3=12;
//char o=c3+i3; possible of  lossy conversion from int to char 
 int o=c3+i3; 
 System.out.println(o);

 float f1=12.98f;
 float f2=23.876f;
 float F3=f1+f2;
 System.out.println(F3);

 float G1=39.08f;
 long l1=654;
 float F6=G1+l1;
 System.out.println(F6);

 float G2=39.08f;
 float l2=654;
 //long F9=G2+l2; // lossy conversion from float to long
 System.out.println(F6);


/* long =C_character+z;
System.out.println(z); */

long l81=1234;
float t1=12.1f;
float d1=l81+t1;
System.out.println(d1);

//long 

















     
    }
}