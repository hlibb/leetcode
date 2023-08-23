package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDublicate217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for (int i : nums) {
            arr.add(i);
        }
        return arr.size() < nums.length;
    }
}
