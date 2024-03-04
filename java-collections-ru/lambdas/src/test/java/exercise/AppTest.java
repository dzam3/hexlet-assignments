package exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// BEGIN
class AppTest {
    @Test
    void testArrays() {
        String[][] expected1 = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        String[][] testArray = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        var actual1 = App.enlargeArrayImage(testArray);
        Assertions.assertThat(actual1).isEqualTo(expected1);
    }
}
// END
