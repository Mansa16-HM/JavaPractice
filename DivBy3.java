public class DivBy3
{
    int div3(int[] array)
        {
            int Count3=0;
            for(int x:array)
            {
                if(x%3==0)
                {
                    Count3++;
                }
            }
            return Count3;
        }
    public static void main(String args[])
    {
        int[] arr={2,3,4,6,8,9,10,12,12,15,14,16,16,18,18,20,21,24,27,30};
        DivBy3 obj1=new DivBy3();
        int result=obj1.div3(arr);
        System.out.println("numbers divisible by 3 in the array:"+result);
        System.out.println(arr.length);
    }
}