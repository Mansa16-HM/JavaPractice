public class binarySearchClass {
    public static int binarySearch(int[] array, int target) 
    {
        // case1: array null
        if (array == null) {
            return -1;
        }

        // case2: empty array
        if (array.length == 0) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
        while (leftIndex <= rightIndex) 
            {
            if (array[midIndex] == target) 
                {
                    return midIndex;
                } 
            else if (array[midIndex] > target) 
                {
                    rightIndex = midIndex - 1;
                } 
            else  
                {
                    leftIndex = midIndex + 1;
                }
        return midIndex;
        } 
        //return midIndex;
            public static void main(String args[])
            {
                int[] array=new int[]{1,2,3,4,5,6,7,8};
                int target=8;
                binarySearchClass searchObj=new binarySearchClass();
                int result=searchObj.binarySearch(array,target);
                System.out.println("Key index is " +result);


            }
    }
}