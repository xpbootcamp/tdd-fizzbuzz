package cc.xpbootcamp.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzConverterTest {

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    void should_convert_to_fizz_buzz_when_15_multiple(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 12, 18, 21, 99})
    void should_convert_to_fizz_when_3_multiple(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 85, 95, 100})
    void should_convert_to_buzz_when_5_multiple(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 94, 97, 98})
    void should_convert_to_self_string_when_common_number(int number) {
        String result = FizzBuzzConverter.convert(number);

        assertThat(result).isEqualTo(String.valueOf(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 101})
    void should_throw_exception_when_out_of_range(int number) {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzConverter.convert(number));
    }

}
