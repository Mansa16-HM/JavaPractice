public class Key
{
    int Number(int key,int...arr)
    {
        int count=0;
       // int key=20;
        for(int x:arr)
        {
            if(x==key)
            {
                count++;
            }

        }
     return count;
    }
    public static void main(String args[])
    {
       // int[] arr={20,10,30,20,40,60};
          Key Obj1=new  Key();
          int result=Obj1.Number(20, 20,10,30,20,40,60);
          System.out.println(result);
    }
}