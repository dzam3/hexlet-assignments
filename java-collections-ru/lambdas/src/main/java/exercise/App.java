package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static String[][] enlargeArrayImage(String[][] image) {
        List<ArrayList<String>> enlargedImage = new ArrayList<>();
        for (var line = 0; line < image.length; line++) {
            enlargedImage.add(new ArrayList<>());
            for (int i = 0; i < image[line].length; i++) {
                var x = image[line][i];
                enlargedImage.get(line).add(x);
                enlargedImage.get(line).add(x);
            }
        }
        return enlargedImage.stream()
                .map(list -> list.toArray(new String[0]))
                .toArray(String[][]::new);
    }
}
// END
