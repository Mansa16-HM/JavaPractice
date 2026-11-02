public class LargeSmallinArrayClass {
    public int largeAndSmallerElementDifferenceInTheArray(int[] nums) {
        int maxElement = nums[0];
        int minelement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (maxElement < nums[i]) {
                maxElement = nums[i];
                
            }
            if (minelement > nums[i]) {
                minelement = nums[i];
                
            } 
    

        }
        /*
         * System.out.println(maxElement);
         * System.out.println(minelement);
         */
        int result = maxElement - minelement;
        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 14, 3, 27, 9 };
        LargeSmallinArrayClass obj = new LargeSmallinArrayClass();
        int result = obj.largeAndSmallerElementDifferenceInTheArray(nums);
        System.out.println(result);
    }
}
