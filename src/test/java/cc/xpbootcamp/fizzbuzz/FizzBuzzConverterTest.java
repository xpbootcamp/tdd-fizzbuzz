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

}
