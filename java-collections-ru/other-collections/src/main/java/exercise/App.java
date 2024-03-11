package exercise;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        System.out.println("Hello" + keys);

        return keys.stream()
                .collect(Collectors.toMap(key -> key, key -> {
                    if (!map1.containsKey(key) && map2.containsKey(key)) {
                        return "added";
                    } else if (map1.containsKey(key) && !map2.containsKey(key)) {
                        return "deleted";
                    } else if (!map1.get(key).equals(map2.get(key))) {
                        return "changed";
                    }
                    return "unchanged";
                }, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

}
//END
