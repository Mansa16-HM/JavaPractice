public class ArrayCount
{
    void CountOfSingnedNumbers(int[] array)
    {
    
        int pos=0;
        int neg=0;
        int zero=0;
        for(int x:array)
     {
            if(x>0)
                {
                  pos++;
                }
            if(x<0)
            {
                neg++;
            }
            if(x==0)
            {
                zero++;
            }
     }
        System.out.println("Positive"+pos);
        System.out.println("Negative"+neg);
        System.out.println("Zero"+zero);
        
     }

public static void main(String args[])
{
    int[] arr={23,85,0,00,-89,-0,88,-0000, 9,-8 };
    ArrayCount objCount=new ArrayCount();
    objCount.CountOfSingnedNumbers(arr);
}
}