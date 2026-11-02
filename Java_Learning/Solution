class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null)
            return 0;
        if (nums.length == 1 && nums[0] == 0)
            return 0;

        int consecativeCount = 0;
        int j = 0;
        while (j < nums.length) {
            for (int i = 1; i < nums.length; i++) {
                if ((nums[i] - nums[j]) == 0) {
                    consecativeCount++;
                    j++;
                }
            }
        }
        return consecativeCount;

    }

    public static void main(String args[]) {
        int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}