class AreaOfSqaure
{
    int  side()
        {
            int x=10;
            return x;
        }
    int Sqaure(int s)
        {
            int Area=s*s;
            return Area;
        }
    
    public static void main (String args[])
    {
       // Scanner sc= new Scanner(System.in);
        //System.out.println("enter the value of side");
       AreaOfSqaure obj1=new  AreaOfSqaure();

     int side_value=obj1.side();
     int Sqaure_Area=obj1.Sqaure(side_value);
     System.out.println(side_value);
     System.out.println(Sqaure_Area);
    }
}