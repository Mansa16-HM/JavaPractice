public class ArrayElements1
{
     int[] CountElements(int[] arr)
    {
     int positive=0;
     int negative=0;
     int Zero=0;
     for(int x : arr)
     {
        if(x>0)
        {
            positive++;

        //return positive;
        }
    
        else if(x<0)
        {
            negative++;

        //return negative;
        }
        else
        {
         Zero++;
         //return Zero;
         }
     }
     return new int[]{positive,negative,Zero};
    }

public static void main(String args[])
{
    int[] arr={23,56,0,0,-9,-8,67};
    ArrayElements1 obj1=new ArrayElements1(); 
    int[] result= obj1.CountElements(arr);
    //System.out.println("Counting of the Numbers(+,-,0)"+Result);
     System.out.println("Counting of the Numbers (+,-,0)in a array");
        System.out.println("Positive: " + result[0]);
        System.out.println("Negative: " + result[1]);
        System.out.println("Zeros: " + result[2]);
     }
}
