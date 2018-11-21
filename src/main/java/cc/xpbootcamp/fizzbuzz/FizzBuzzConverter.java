
package cc.xpbootcamp.fizzbuzz;

public class FizzBuzzConverter {
    public static String convert(int number) {
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        return null;
    }
}