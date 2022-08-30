package Easy.DuplicateZeros1089;

import java.util.Arrays;

public class Solution {
    public int[] duplicateZeros(int[] arr) {

        int index = 0;
        int[] standard = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i + 1 < arr.length) {
                    i++;
                    arr[i] = 0;
                    System.arraycopy(standard, (i - index), arr, i + 1, arr.length - (i + 1));
                    index++;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0})));
        System.out.println(Arrays.toString(s.duplicateZeros(new int[]{0, 4, 1, 0, 0, 8, 0, 0, 3})));
        //took a bit more than 2 hours
    }
}