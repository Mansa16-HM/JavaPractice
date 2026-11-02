public class Grade
{
    public static void main(String args[])
    {
        int OverallMarks=90;
        int M1=12,M2=30,M3=23;
     double TotalMarks=M1+M2+M3;
     double Avg=TotalMarks/3;
      double Percentage = (TotalMarks/OverallMarks)*100;
      System.out.println("Average Marks:"+Avg);
      System.out.println("Percentage:"+Percentage);

    }
}