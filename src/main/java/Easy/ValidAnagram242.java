package Easy;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        var listS = new ArrayList<>(List.of(s.split("")));
        for (String st : (List.of(t.split("")))) {
            if (listS.isEmpty()) return false;
            listS.remove(st);
        }
    return listS.isEmpty();
    }
}
