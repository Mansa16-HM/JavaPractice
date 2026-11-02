import java.util.*;
public class AverageAndSum
{
   int Sum(int m1,int m2,int m3)
    {
        int total=m1+m2+m3;
        return total;
    }
    float Percentage(int Sum)
        {
            int percentage = Sum%300*100;
            return percentage;
        }
   
   int Avg(int SumValue)
   {
    int avg=SumValue/3;
    return avg;
   }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("entre the 3 marks u obtained:");
    int Marks1=sc.nextInt();
    int Marks2=sc.nextInt();
    int Marks3=sc.nextInt();

    AverageAndSum obj1=new AverageAndSum();
    
    int totalSum=obj1.Sum(Marks1,Marks2,Marks3);
    float Percentage=obj1.Percentage(totalSum);
  int Average=obj1.Avg(totalSum);

   System.out.println("Sum of marks: " + totalSum);
    System.out.println("Percentage " + Percentage);
        System.out.println("Average of marks: " + Average);
    

}
}