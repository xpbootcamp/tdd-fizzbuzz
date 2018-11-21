
package cc.xpbootcamp.fizzbuzz;

public class FizzBuzzConverter {
    private static final int RANGE_MIN = 1;
    private static final int RANGE_MAX = 100;

    public static String convert(int number) {
        if (number < RANGE_MIN || number > RANGE_MAX) {
            throw new IllegalArgumentException();
        }
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}