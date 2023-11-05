package s1lkbeard.home;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task_1_2Test {

    @ParameterizedTest
    @MethodSource("dataEq1")
    void getEq1(Double exp, Double x) {
        assertEquals(exp, Task_1_1.getEq1(x));
    }

    static Stream<Arguments> dataEq1() {
        return Stream.of(
                Arguments.of(2.542574618653433, 0.55),
                Arguments.of(3.5978284941180343, 0.955)
        );
    }
}