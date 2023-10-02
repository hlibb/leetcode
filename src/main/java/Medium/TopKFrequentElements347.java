package Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();


        int currentElement = 0;
        int counter = 0;
        for (int i : nums) {
            if (!map.containsKey(i)) {
                currentElement = i;
                map.computeIfAbsent(currentElement, elem -> new Integer(1));
                map.get(i);
            }}
        return null;
    }
}
