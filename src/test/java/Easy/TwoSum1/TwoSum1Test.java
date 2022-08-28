package Easy.TwoSum1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum1Test {

    @Test
    public void test1() {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        Assertions.assertEquals(result, result);
    }
}
