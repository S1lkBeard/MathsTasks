package s1lkbeard.home;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task_1_1Test {

    @Test
    void getEq1_0_5() {
        assertEquals(2.4583251056855717, Task_1_1.getEq1(0.5));
    }


    @ParameterizedTest
    @MethodSource("dataEq1")
    void getEq1(Double exp, Double x) {
        assertEquals(exp, Task_1_1.getEq1(x));
    }

    static Stream<Arguments> dataEq1() {
        return Stream.of(
                Arguments.of(2.0328710836980775, -1.0), // null strings should be considered blank
                Arguments.of(Double.POSITIVE_INFINITY, 10000.0)
        );
    }

    @ParameterizedTest
    @MethodSource("dataEq2")
    void getEq2(Double exp, Double x) {
        assertEquals(exp, Task_1_1.getEq2(x));
    }

    static Stream<Arguments> dataEq2() {
        return Stream.of(
                Arguments.of(4.086567450916261, 0.5),
                Arguments.of(49.019005323199785, 10000.0)
        );
    }

    @ParameterizedTest
    @MethodSource("dataEq3")
    void getEq3(Double exp, Double x) {
        assertEquals(exp, Task_1_1.getEq3(x));
    }

    static Stream<Arguments> dataEq3() {
        return Stream.of(
                Arguments.of(NaN, 0.5),
                Arguments.of(21.89549687859206, 10.0),
                Arguments.of(NaN, -0.5)
        );
    }

    @ParameterizedTest
    @MethodSource("dataEq4")
    void getEq4(Double exp, Double x) {
        assertEquals(exp, Task_1_1.getEq4(x));
    }

    static Stream<Arguments> dataEq4() {
        return Stream.of(
                Arguments.of(-0.1945226705589214, 0.5),
                Arguments.of(0.0, 10000.0),
                Arguments.of(NaN, -0.5)
        );
    }

    @ParameterizedTest
    @MethodSource("dataEq5")
    void getEq5(Double exp, Double x) {
        assertEquals(exp, Task_1_1.getEq5(x));
    }

    static Stream<Arguments> dataEq5() {
        return Stream.of(
                Arguments.of(1.7564629526993032, 0.5),
                Arguments.of(21.521168760112527, 10000.0),
                Arguments.of(NaN, -0.5)
        );
    }
}