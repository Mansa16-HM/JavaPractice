public class SecondLargest
{
    int SecondLargestMethod(int[] Single_array)
    {
      int max=Single_array[0];
      int Max2=Single_array[1];
      for(int x:Single_array)
      {
        if(x>max)
        {
             Max2=max;
            max=x;
           
        }
        else if(x > Max2 && x != max) {
                // Update secondLargest if smaller than largest
                Max2 = x;
      }
      }
      return Max2;
    }
public static void main(String args[])
{
    int[] arr={12,34,21,56,78,54,22,21};
    SecondLargest Second=new SecondLargest();
    int s_large=Second.SecondLargestMethod(arr);
    System.out.println("Second Largest element is"+s_large);
}
}