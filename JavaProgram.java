class JavaProgram 
    {
        static int findSum(int[] arr)
            {
                int sum=0;
                for(int x:arr)
                {
                   sum+=x;
                }
            return sum;
            }

public static void main(String args[])
    {
        int[] arr={1,3,5,7};
        int result=findSum(arr);
        System.out.println("Addition of the array values:"+result);
    }
    }