import java.util.*;
class methodDemo23
    {
       public static int Square(int num)
       {
        int SquareRT=num*num;
        return SquareRT; 
       } 
    
       public static int Cube(int num)
        {
            int sqaurert_value=Square(num);
            int CubeRT=sqaurert_value*num;
            return  CubeRT;

        }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numnber which one u wnat the cube!");
        int num=sc.nextInt();
        int result=Cube(num);
        System.out.println("The Cube value of Number is" +result);
    } 
    }