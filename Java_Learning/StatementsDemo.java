import java.util.*;
public class StatementsDemo
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);

//To check the given number is positive
/*  
 System.out.println("enter the Number");
 int num=sc.nextInt();
 if (num>=0)
 {
 System.out.println("Its a positive Number!") ;
 } */
/* 
System.out.println("Enter the Character U want to check for UpperCase!");
char C=sc.next().charAt(0);
if(C>='A' && C<='Z')
{
System.out.println("Its Upper Case Letter!");
}
 */

/* System.out.println("Enter the Number which One u want to check for Even OR Odd ");
int Num=sc.nextInt();
if(Num%2==0)
{
System.out.println("Its Even Number!");
}
else
{
System.out.println("Its a Odd Number!");
} */
/* 
System.out.println("Enter the 2 number:");
int num1=sc.nextInt();
int num2=sc.nextInt();

if(num1>num2)
{
System.out.println(num1+" is Bigger Number here");
}
else{
    System.out.println(num2+" is Bigger Number here");
} */


/* System.out.println("Enter the 3 number:");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt(); */
 //using else if ladder
/* if(num1>num2 && num1>num3)
{
System.out.println(num1+" is Bigger Number here(Num1)");
}
else if(num2>num1&& num2>num3){
   System.out.println(num2+" is Bigger Number here(num2)"); 
}
else{
    System.out.println(num3+" is Bigger Number here(num3)");
} */

//by using the Math Function
/* int largest=Math.max(num1,Math.max(num2,num3));
System.out.println("Largest Number is :" +largest); */


int age =sc.nextInt();
if(age>=0&& age<=10)
{
    System.out.println("He/She is a Child");
}
else if(age<=18 && age>=10)
{
    System.out.println("He/she is a Teenager");
}
else if(age<=35&& age>=18)
{
    System.out.println("He/she is a Adult");
}
else
{
    System.out.println("SENIOR!");
}
}
}
