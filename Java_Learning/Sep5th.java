import java.util.*;
public class Sep5th
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        /*  System.out.println("Enter the Start and Stop:");
       int Start = sc.nextInt();
     int Stop = sc.nextInt();  */
        /*for(Start=Start;Start<=Stop;Start+=3)
        {
            System.out.println("here number's are incrementing by 3(For):"+Start);
        }   
         while(Start<=Stop)
        {
            System.out.println("here number's are incrementing by 3(While):"+Start);
            Start+=3;
        } 
       do
       {
        System.out.println("here number's are incrementing by 3(DoWhile):"+Start);
        Start+=3;
       }while(Start<=Stop); */

       // to Increment the value by 5
        
       /*  for(Start=Start;Start>=Stop;Start-=5)
        {
            System.out.println("Decrementing the value by 5(FOR):"+Start);
        }*/

       /* while(Start>=Stop)
       {
        System.out.println("Decrementing the value by 5(While):"+Start);
         Start-=5;
       } */
 
     /* do
     {
        System.out.println("Decrementing the value by 5(doWhile):"+Start);
        Start-=5;
     }while(Start>=Stop); */
/* 
     System.out.println("Enter the Character where we want to start and end of the character printing :");
    char c1=sc.next().charAt(0);
    char c2=sc.next().charAt(0); */
   /*  for(c1=c1;c1>=c2;c1--)
    {
        System.err.print(c1);
    }
 */
    /* while(c1>=c2){
        c1=c1;
        System.out.println("Printcing the Alphabets in the reverse order:"+c1);
        c1--;
    }
 */
/* do
{
    c1=c1;
    System.out.println("Printing the Alphabets in the reverse order:"+c1);
    c1--;
}
while(c1>=c2); */

/* for(Start=Start;Start<=Stop;Start++)
{
    System.out.println(Start);
} */
/* 
while(Start<=Stop)
{
    System.out.println(Start);
    Start++;
} */


/* 
do
{
    System.out.println(Start);
    Start++;
}
while(Start<=Stop); */

/* for(Start=Start;Start<=Stop;Start+=5)
{
    System.out.println(Start);
} */

/* while(Start<=Stop)
{
    System.out.println("Multiples of 5;"+Start);
    Start+=5;
} */
/* do
{
    System.out.println("Multiples of 5;"+Start);
    Start+=5;
}while(Start<=Stop); */
//System.out.println("Enter the number to from where to where u want the square Number's:");
//int Num1=sc.nextInt();
//int Num2=sc.nextInt();
 /* for(Num1=Num1;Num1<=Num2;Num1++)
 {
    int Squ=Num1*Num1;
    System.out.println(Num1+ "'s Square Number is "+Squ);
 } */


/* while(Num1<=Num2){
    int squ=Num1*Num1;
     System.out.println(Num1+ "'s Square Number is " +squ);
     Num1++;
} */
/* do{
    int squ=Num1*Num1;
     System.out.println(Num1+ "'s Square Number is " +squ);
     Num1++;
}
while(Num1<=Num2);


} */
/* for(Num1=Num1;Num1<=Num2;Num1++)
 {
    int Cube=Num1*Num1*Num1;
    System.out.println(Num1+ "'s Cube Number is "+Cube);
 } */

/* while(Num1<Num2)
{
    int Cube=Num1*Num1*Num1;
    System.out.println(Num1+"'s Cube Number is :" +Cube);
    Num1++;
} */
/* do
{
    int cube=Num1*Num1*Num1;
    System.out.println(Num1+"'s Cube is "+cube);
    Num1++;
}while(Num1<=Num2); */

//int sum=0;
/* for(Start=Start;Start<=Stop;Start++)
{
sum=sum+Start;
}
System.out.println("Sum of the numbers N numbers=" +sum); */

/* while(Start<=Stop)
{
    sum=sum+Start;
     Start++;
}
    System.out.println("Sum of the numbers N numbers=" +sum); */
/* int Sum=0;
    do{
        Sum=Sum+Start;
        Start++;
    
//System.out.println("Sum of the N Number's"+Sum);

}while(Start<=Stop);
System.out.println("Sum of the N Number's"+Sum); */

//import java.util.Scanner;

//public class PowerOfTwo {
    //public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter stop: ");
        int stop = sc.nextInt();

        long power = 1;

        for (int i = 1; i <= stop; i++) {
            power = power * 2;

            if (i >= start) {
                System.out.println("2 ^ " + i + " = " + power);
            }
        }
    }
}


    