import java.util.*;
public class Sep4
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
     // System.out.println("enter the number");
    //int Num=sc.nextInt(); 
     
    /* System.out.println("Using For Loop");
    for(int i=0;i<=Num;i++)
    {
        i*=2;
        System.out.println("Power of "+power);
    }
 */

/* System.out.println("Using While Loop:");
 int i=0;
 while(i<=Num)
 {
     i*=2;
    System.out.println("Power"+power);
    i++;
 }
  */

/*  System.out.println("Using Do While");
  System.out.println("Enter the start:");
  int start=sc.nextInt();
  System.out.println("Enter the end:");
  int End=sc.nextInt();

  do{
     start*=2;
    System.out.println("Power"+start);
 start++;
  }
  while(start<=End); */

  //Multiplication 
  
 /*  for(int i=1;i<=10;i++)
  {
   int  Multi=Num*i;
System.out.println(Num+ "X" +i+ "=" +Multi );
  }
 */
/* int i=0;

while(i<=10)
{
     int  Multi=Num*i;
    System.out.println(Num+ "X" +i+ "=" +Multi );
    i++;
} */

 /* System.out.println("Multiplication table Using Do while");
System.out.println("enter the start Value:");
 int start=sc.nextInt();
System.out.println("enter the End Value:"); 
int end=sc.nextInt();
 do
  { 
    int  Multi=start*Num;
    System.out.println(Num+ "X" +start+ "=" +Multi );
    start++;  
 } while (start<=end);  */

/*  int i=1;
do
{
     int  Multi=Num*i;
    System.out.println(Num+ "X" +i+ "=" +Multi );
    i++;
}while(i<=10);  */
/* 
System.out.println("enter the start Value:");
 int start=sc.nextInt();
System.out.println("enter the End Value:"); 
int end=sc.nextInt();
for(start=start;start>=end;start-=10)
{
System.out.println(start);
//start-=10; */

System.out.println("enter the NUmber:");
//System.out.println();
String Num=sc.next();//"127"-->word
boolean octal=true; // just assume that number is octal number
for(int i=0;i<=Num.length()-1;i++)
{
char ch=Num.charAt(i);
if(ch < '0' || ch > '7')
{
   octal=false;
   break;
 //  System.out.println()
}
}
if(octal)
{
   System.out.println("Yes ,this is Octal Number");
}
else
{
    System.out.println("Yes ,this is not Octal Number");
}

 }

 }