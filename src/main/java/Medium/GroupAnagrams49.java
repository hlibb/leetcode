package Medium;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
         */
        HashMap<String, ArrayList<String>> hashmap = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String s2 = new String(chars);

            List<String> arr = hashmap.computeIfAbsent(s2, key -> new ArrayList<>());
            arr.add(s);
        }
        return new ArrayList<>(hashmap.values());
    }

    public static void main(String[] args) {

    }

}
