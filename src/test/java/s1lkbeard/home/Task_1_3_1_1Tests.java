package s1lkbeard.home;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task_1_3_1_1Tests {

    @ParameterizedTest
    @MethodSource("dataV")
    void getV(Double exp, Double R, byte H, int j) {
        assertEquals(exp, Task_1_3_1_1.getV(R, H, j));
    }

    static Stream<Arguments> dataV() {
        return Stream.of(
                Arguments.of(2.542574618653433, 3, 1, 1),
                Arguments.of(3.5978284941180343, 3, 1, 2)
        );
    }
}