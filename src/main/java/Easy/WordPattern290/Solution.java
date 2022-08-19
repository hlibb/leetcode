package Easy.WordPattern290;

import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        var letters = pattern.split("");
        var words = s.split(" ");
        if (letters.length != words.length) return false;

        HashMap<String, String> combUnique = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            if (combUnique.containsValue(words[i])) continue;
            if (!combUnique.containsKey(letters[i])) combUnique.put(letters[i], words[i]);
        }
        System.out.println(combUnique);

        for (int i = 0; i < letters.length; i++) {
            if (combUnique.get(letters[i]) == null) return false;
            if (!combUnique.get(letters[i]).equals(words[i])) return false;
        }
        return true;
    }
}
