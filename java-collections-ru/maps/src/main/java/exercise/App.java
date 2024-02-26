package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<String, Integer>();
        }

        String[] words = sentence.split("\\s+");
        var wordsStream = Arrays.stream(words);
        var result = wordsStream.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        Map<String, Integer> resultInt = result.entrySet().stream()
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                entry -> Math.toIntExact(entry.getValue())
                        )
                );

        return resultInt;
    }

    public static String toString(Map<String, Long> wordsMap) {
        var result = wordsMap.toString();
        if (!wordsMap.isEmpty()) {
            result = result
                    .replace("=", ": ")
                    .replace(",", "\n ")
                    .replace("{", "{\n  ")
                    .replace("}", "\n}");
        }
        return result;
    }
}
//END
