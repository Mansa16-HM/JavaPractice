class SolutionForConsecutive{
    public static int findMaxConsecutiveOnesDemo(int[] nums) {
        int consecativeCount=1;
        for(int i=0;i<=nums.length;i++)
        {
            if((nums[1]-nums[i-1])==0)
            {
                consecativeCount++; 
            }
        }
        return  consecativeCount;
    }
public static void main(String args[])
{
    int[] nums=new int[]{1,1,0,1,1,1};
    findMaxConsecutiveOnesDemo(nums);
}
}