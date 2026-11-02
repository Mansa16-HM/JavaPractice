
public class heightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = heights.clone();
        // int j=0;
        for (int i = 0; i < expected.length - 1; i++) {
            for (int j = 0; j < expected.length - 1; j++) {
                if (expected[i] > expected[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        for (int t = 0; t < heights.length; t++) {
            while (expected[t] != heights[t])
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 1, 1, 4, 2, 1, 3 };
        heightChecker obj = new heightChecker();
        int Count = obj.heightChecker(arr);
        System.out.println(Count);
    }
}
