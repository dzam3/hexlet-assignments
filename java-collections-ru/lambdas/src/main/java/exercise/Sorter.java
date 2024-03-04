package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.function.Function;

// BEGIN
public class Sorter {

    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(u -> u.get("gender").equals("male"))
                .sorted(Comparator.comparing(getBirthday()))
                .map(u -> u.get("name"))
                .toList();
    }

    private static Function<Map<String, String>, LocalDate> getBirthday() {
        return u -> LocalDate.parse(u.get("birthday"));
    }
}
// END
