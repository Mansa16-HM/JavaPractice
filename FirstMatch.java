import java.util.*;
public class FirstMatch    
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
           System.out.println("entre the size of the array");
            int n=sc.nextInt();
            System.out.println("Enter the Array elements:");
            int[] arr=new int[n];
            
            for(int i=1;i<=arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
            System.out.println("enter the element to search");
            int target=sc.nextInt();

            boolean found = false;
            for(int i=0;i<=arr.length; i++)
            if(arr[i]==target){
            found= true;
            break;
            }
    if(found)
        {
            System.out.println("Match Found");
        }
        else
        {
            System.out.println("Element is not in the array");  
        }
                   }
    }