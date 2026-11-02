class MaxMethod
{
    static int Max(int[] arr)
    {
       int max=arr[0];
       for(int x:arr)
       {
        if(x>max)
        {
            max=x;
        }
       }
            return max;
       }
    public static void main(String args[])
    {
        int[] arr={23,56,34,90};
        int result=Max(arr);
        System.out.println("Max in the Array:"+result);
    }
}