public class SearchKey {
    public boolean IsSearchKeyFound(int[] nums, int key) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (key == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 12, 34, 32, 12, 35, 67, 77, 89 };
        int key = 89;
        SearchKey SearchObj = new SearchKey();
        boolean result = SearchObj.IsSearchKeyFound(array, key);
        System.out.println(result);

    }
}
