public class ClassForConcatenatingTheTwoArrays {
    public char[] ConvertIntoSingleArray(char[] Arr1, char[] Arr2) {
        if (Arr1 == null || Arr2 == null)
            return null;
        if (Arr1.length == 0)
            return Arr2;
        if (Arr2.length == 0)
            return Arr1;
        int newLength = (Arr1.length + Arr2.length);

        char[] resultantArray = new char[newLength];

        for (int i = 0; i < Arr1.lengthArr1; i++) {
            resultantArray[i] = Arr1[i];
            if (i == Arr1.length) {
                resultantArray[i] = ' ';
            }
        }
        for (int j = (Arr1.length + 1); j < resultantArray.length; j++) {
            for (int h = 0; h < Arr2.length; h++) {
                resultantArray[j] = Arr2[h];
            }
        }
        return resultantArray;
    }

    public static void main(String[] args) {
        char[] Arr1 = new char[] { 'R', 'A', 'M' };
        char[] Arr2 = new char[] { 'S', 'E', 'E', 'T', 'H', 'A' };
        ClassForConcatenatingTheTwoArrays NewObj = new ClassForConcatenatingTheTwoArrays();
        char[] resultantArray = NewObj.ConvertIntoSingleArray(Arr1, Arr2);
        System.out.println(resultantArray);
    }
}
