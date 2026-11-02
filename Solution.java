class Solution {
    public static void removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[index];
                index++;
            }
        }

    }

    public static void main(String args[]) {
        int[] arr = new int[] { 3, 2, 2, 3 };
        removeElement(arr, 3);

    }
}
