package exercise;

import java.util.List;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var expected1 = new ArrayList<Integer>(List.of(1, 2, 3));
        var actual1 = App.take(List.of(1, 2, 3, 4, 5), 3);
        Assertions.assertThat(actual1).isEqualTo(expected1);

        var expected2 = new ArrayList<Integer>();
        var actual2 = App.take(List.of(), 3);
        Assertions.assertThat(actual2).isEqualTo(expected2);

        var expected3 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));
        var actual3 = App.take(List.of(1, 2, 3, 4, 5), 100);
        Assertions.assertThat(actual3).isEqualTo(expected3);
        // END
    }
}
