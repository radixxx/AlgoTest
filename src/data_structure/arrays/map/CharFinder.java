package data_structure.arrays.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {

    public char findFirstRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1) return ch;
        }

        return Character.MIN_VALUE;
    }

    public char firstRepetCharac(String str) {
        Set<Character> chars = new HashSet<>();

        for (var ch : str.toCharArray()) {
            if (chars.contains(ch)) ;
            return ch;


            //chars.add(ch);
        }

        return Character.MIN_VALUE;
    }


}
