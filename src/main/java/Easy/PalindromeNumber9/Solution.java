package Easy.PalindromeNumber9;

import java.util.Arrays;

public class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] charArr = str.toCharArray();
        char[] result = new char[charArr.length];
        int count = 0;
        for (int i = charArr.length - 1; i >= 0; i--) {
            result[count] = charArr[i];
            count++;
        }
        return Arrays.equals(result, charArr); //done in 25 min
    }
}

