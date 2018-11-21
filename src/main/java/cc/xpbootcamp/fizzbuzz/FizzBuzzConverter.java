
package cc.xpbootcamp.fizzbuzz;

public class FizzBuzzConverter {
    public static String convert(int number) {
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return  "Fizz";
        }
        if (number % 5 == 0){
            return  "Buzz";
        }
        return String.valueOf(number);
    }
}