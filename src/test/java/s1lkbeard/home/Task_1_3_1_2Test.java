package s1lkbeard.home;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task_1_3_1_2Test {

    @ParameterizedTest
    @MethodSource("dataAngle")
    void getAngle(Double exp, byte N) {
        assertEquals(exp, Task_1_3_1_2.getAngle(N));
    }

    @ParameterizedTest
    @MethodSource("dataS")
    void getS(Double exp, Double R, int x, double angle) {
        assertEquals(exp, Task_1_3_1_2.getS(R, x, angle));
    }

    static Stream<Arguments> dataAngle() {
        return Stream.of(
                Arguments.of(0.7853981633974483, 1),
                Arguments.of(0.39269908169872414, 3)
        );
    }

    static Stream<Arguments> dataS() {
        return Stream.of(
                Arguments.of(1.7220754456429042, 3, 1, 0.39269908169872414),
                Arguments.of(3.181980515339464, 3, 2, 0.39269908169872414),
                Arguments.of(4.15745789630079, 3, 3, 0.39269908169872414)
        );
    }


}