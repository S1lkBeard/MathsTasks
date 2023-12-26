package s1lkbeard.home;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.jupiter.api.Assertions.*;

class Task_1_3_2Test {

    @ParameterizedTest
    @MethodSource("dataEq")
    void getEq(Double exp, Double X, Double k) {
        assertEquals(exp, Task_1_3_2.getEq(X, k));
    }

    static Stream<Arguments> dataEq() {
        return Stream.of(
                Arguments.of(1.25, 0.5, 1.0),
                Arguments.of(POSITIVE_INFINITY, 0.5, 0.0),
                Arguments.of(NaN, 0.5, -5.0)
        );
    }

    @ParameterizedTest
    @MethodSource("dataFinal")
    void getFinalEq(Double exp, Double X, Double res) {
        assertEquals(exp, Task_1_3_2.getfinalEq(X, res));
    }

    static Stream<Arguments> dataFinal() {
        return Stream.of(
                Arguments.of(-1.4901290717342737, 0.5, 1.0),
                Arguments.of(-0.4901290717342736, 0.5, 0.0),
                Arguments.of(4.509870928265727, 0.5, -5.0)
        );
    }
}