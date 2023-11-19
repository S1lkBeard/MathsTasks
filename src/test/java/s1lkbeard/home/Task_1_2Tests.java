package s1lkbeard.home;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedHashMap;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task_1_2Tests {

    static Stream<Arguments> getEq1Data() {
        return Stream.of(
                Arguments.of(2.0328710836980775, -1.0), // null strings should be considered blank
                Arguments.of(Double.POSITIVE_INFINITY, 10000.0)
        );
    }

    @ParameterizedTest
    @MethodSource("getEq1Data")
    void getEq1Test(Double exp, Double x) {
        assertEquals(exp, Task_1_2.getEq1(x));
    }

    static Stream<Arguments> getNEqFromAtoBData() {
        return Stream.of(
                // Основной вариант использования функции
                Arguments.of(10, 0.55, 1.0, new LinkedHashMap<Double, Double>() {{
                    put(0.55, 2.542574618653433);
                    put(0.5950000000000001, 2.6281582048839494);
                    put(0.6400000000000001, 2.722337633622857);
                    put(0.6850000000000002, 2.824649451993068);
                    put(0.7300000000000002, 2.9347633195293596);
                    put(0.7750000000000002, 3.0524615354256195);
                    put(0.8200000000000003, 3.177622241974861);
                    put(0.8650000000000003, 3.310205731348277);
                    put(0.9100000000000004, 3.4502433411247706);
                    put(0.9550000000000004, 3.597828494118035);
                }}),
                // Еще один нормальный вариант
                Arguments.of(2, 1.0, 2.0,  new LinkedHashMap<Double, Double>()  {{
                    put(1.0, 3.7531095076512795);
                    put(1.5, 6.083995961286194);
                }}),
                // Если B больше A
                Arguments.of(2, 3.0, 2.0,  new LinkedHashMap<Double, Double>()),
                // Если количество отрицательное
                Arguments.of(-2, 1.0, 2.0,  new LinkedHashMap<Double, Double>()  {{
                    // Тесты хорошая вешщь, при -2 улетает в бесконечный цикл ) надо пофиксить
                }}),
                // Если количество 0
                Arguments.of(0, 1.0, 2.0,  new LinkedHashMap<Double, Double>())
        );
    }

    @ParameterizedTest
    @MethodSource("getNEqFromAtoBData")
    void getNEqFromAtoBTest(int N, double A, double B, LinkedHashMap<Double, Double> exp) {
        assertEquals(exp, Task_1_2.getNEqFromAtoB(N, A, B));
    }
}