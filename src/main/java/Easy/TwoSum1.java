package Easy;

import java.lang.reflect.Array;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return new int[0];
    }



    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twoSum(nums, target);
    }
}
