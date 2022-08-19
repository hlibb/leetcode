package WordPattern290Test;

import Easy.WordPattern290.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordPattern290Test {
    @Test
    public void TestOne() {
        Solution s = new Solution();
        Assertions.assertFalse(s.wordPattern("abba", "dog cat cat fish"));
    }
    @Test
    public void TestTwo() {
        Solution s = new Solution();
        Assertions.assertFalse(s.wordPattern("abba", "dog dog dog dog"));
    }
}
