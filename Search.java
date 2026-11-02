public class Search
{
    static boolean search(int arr[], int key)
    {
        for(int x:arr)
        {
        if ( x == key)
            {
                return true;
            }
        }
            return false;
    }
public static void main(String args[]) 
{
    int[ ] array={78,97,37,90,32};
    System.out.println(search(array,80));
    System.out.println(search(array,97));
}
}