package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> filter) {
        return books.stream()
                .filter(book -> {
                    var i = 0;
                    for (Map.Entry<String, String> condition: filter.entrySet()) {
                        var conditionName = condition.getKey();
                        if (book.get(conditionName).equals(condition.getValue())) {
                            i += 1;
                        }
                    }
                    return i == filter.size();
                })
                .toList();
    }
}
//END
