package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        var lettersArray = letters.split("");
        List<String> letterList = new ArrayList<>(Arrays.asList(lettersArray));
        var wordArray = word.toLowerCase().split("");
        List<String> wordList = new ArrayList<>(Arrays.asList( wordArray));


        var wordCheck = wordList.stream()
                .filter(c -> {
                    if (letterList.contains(c)) {
                        letterList.remove(c);
                        return true;
                    }
                    return false;
                })
                .toList();

        return wordList.containsAll(wordCheck) && wordList.size() == wordCheck.size();
    }
}
//END
