package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String SayNumbers(int inputNum) {
        String result  = String.valueOf(inputNum);
        if (inputNum % 3 == 0) {
            result = "Fizz";
        }
        if (inputNum % 5 == 0) {
            result = "Buzz";
        }
        if (inputNum % 7 == 0) {
            result = "Whizz";
        }
        return result;
    }
}
