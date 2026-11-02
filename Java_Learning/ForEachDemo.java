import java.util.*;
class ForEachDemo
    {
        static void ModifyUsingForEach(int arr[])
       {
        System.out.println("ModifyUsingForEach Values");
          for(int x:arr)
          {
            x*=10;
           // System.out.println("ModifyUsingForEach Values");
            System.out.print(x+" " );
             System.out.println();
          } 
       }    
       static void display(int arr[])
       {
         System.out.println("Display Method Values:");
        for(int x:arr)
        {
           // System.out.println("Display Method Values:");
            System.out.print(x+ " ");
             System.out.println();
        }
       }
       static void ModifyUsingFor(int arr[])
       {
         System.out.println("ModifyUsingFor Values");
          for(int i=0;i<arr.length;i++)
          {
          //  System.out.println("ModifyUsingFor Values");
            System.out.print(arr[i]+ " " );
            System.out.println();
            arr[i]*=10;
          } 
       }   
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the size of the array");
          int Size=sc.nextInt();
          System.out.println("enter the "+Size+" elements for Array:");
          int a[]=new int[Size];
          for(int i=0;i<Size;i++)
          {
            a[i]=sc.nextInt();
          }

          ForEachDemo Obj1=new ForEachDemo();
          Obj1.display(a);
         Obj1.ModifyUsingFor(a);
         Obj1.ModifyUsingForEach(a);

        //int  System.out.println("");

        }
    }