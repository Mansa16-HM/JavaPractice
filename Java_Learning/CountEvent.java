import java.util.*;
public class CountEvent
{
    static void CountEventValue(int...arr)
    {
        int Count=0;
        for(int x:arr)
        {
            if(x%2==0){
                Count++;
            }
        }
            System.out.println("Count of the even Number in the given array:"+Count);

    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of the array");
          int Size=sc.nextInt();
          System.out.println("enter the "+Size+" elements for Array:");
          int a[]=new int[Size];
          for(int i=0;i<Size;i++)
          {
            a[i]=sc.nextInt();
          }
          CountEventValue(a);
     // CountEvent obj1=new  CountEvent();
      //int Resultent=obj1.CountEventValue(a[i]);

    }
}