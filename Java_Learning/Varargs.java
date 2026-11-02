class Varargs
{
    static void Show(int...a)
    {
        System.out.println(" Args");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
          
        }
    }
   /* static void Show(int a)
    {
        System.out.println("One Arguments");
    }
    static void Show(int a,int b)
    {
       System.out.println("Two Arguments");
    }*/
    public static void main(String args[])
    {
     Show();
     Show(1);
     Show(16,12);
     Show(16,12,76,90,575,90,23,12,99,89,999); 
    }
}