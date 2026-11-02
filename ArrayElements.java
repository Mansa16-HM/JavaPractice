public class ArrayElements
    {
        static int Average(int[] arr)
            {
              int sum=0;
              int average=0;
             for(int x : arr)
                {
                    sum+=x;
                     average=sum/arr.length;
                }
                return average;
            }

public static void main(String args[])
    {
        int[] arr={45,78,90,60,19};
       // int Sum=SumValue(array);
        int Average=Average(arr);
        System.out.println("Average of the array elements:"+Average);
    }
    }

    