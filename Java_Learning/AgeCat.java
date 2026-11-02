import java.util.*;
class AgeCat
{
    public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
/*
System.out.println("enter the Age");
int age =sc.nextInt();
if(age>=0&& age<=10)
{
    System.out.println("He/She is a Child");
}
else if(age<=18 && age>=10)
{
    System.out.println("He/she is a Teenager");
}
else if(age<=35&& age>18)
{
    System.out.println("He/she is a Adult");
}
else
{
    System.out.println("SENIOR!");
} */
System.out.println("enter ur Obtained Marks!");
int Marks=sc.nextInt();
System.out.println("enter ur Family Income!");
long Income=sc.nextLong();
if(Marks>=80)
{
    if(Income<=80000)
    {
        System.out.println("U r Eligible For Scolarship!");
    }
    else
    {
       System.out.println("U r not Eligible for Scholarship!");
    }
}
else if(Marks>=60)
{
System.out.println("U r not eligible!");
    }
    else 
    {
        System.out.println("Below Average !better luck Next Time");
    }
}
}
