import java.util.Scanner;
public class ArrayNumberCount
    {
        int NumberCount(int[] arr,int key)
        {
            int count=0;
            for(int x:arr)
            {
                if(key==x)
                {
                    count++;
                }
            }
            return count;
        }
        public static void main(String args[])
        {

            Scanner SC=new Scanner(System.in);
            System.out.println("enter the Number which one u want to count in the array:");
             int key=SC.nextInt();
           int[] array={12,87,90,25,12,12,12,12,36,0,89};
           ArrayNumberCount obj1=new ArrayNumberCount();
           int ArrNumCount=obj1.NumberCount(array,key);
           System.out.println("Count of the number u have given in aarray is "+ArrNumCount);


        }
    }