package exercise;

import java.util.List;
import java.util.Arrays;
public class App {

    public static String getForwardedVariables(String content) {

        var lines = content.lines();

        List<String> vars = lines
                .filter(x -> x.startsWith("environment="))
                .flatMap(line -> Arrays.stream(line.split("[\",]")))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replace("X_FORWARDED_", ""))
                .toList();
        return String.join(",", vars);
    }
}
// BEGIN

//END
