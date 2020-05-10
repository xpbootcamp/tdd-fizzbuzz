package cn.xpbootcamp.fizzbuzz;

import static cn.xpbootcamp.fizzbuzz.FizzBuzz.Rules.*;

public class FizzBuzz {
    static String FIZZ = "Fizz";
    static String BUZZ = "Buzz";
    static String WHIZZ = "Whizz";

    public static class Rules {
        public static final int fizz = 2;
        public static final int buzz = 4;
        public static final int whizz = 8;
        public static final int fizzbuzz = 2 + 4;
        public static final int fizzwhizz = 2 + 8;
        public static final int buzzwhizz = 4 + 8;
        public static final int fizzbuzzwhizz = 2 + 4 + 8;
        public static final int contain3 = 16;

    }

    public String SayNumbers(int inputNum) {
        String result = String.valueOf(inputNum);
        int flag = 0;
        boolean Is3 = (inputNum % 3 == 0);
        boolean Is5 = (inputNum % 5 == 0);
        boolean Is7 = (inputNum % 7 == 0);
        boolean Contain3 = result.contains("3");
        boolean Contain5 = result.contains("5");
        boolean Contain7 = result.contains("7");

        if (Contain7) {
            if (Contain5) {
                flag = (1 << (Is3 ? 1 : 0)) | (1 << (Is7 ? 3 : 0));
            } else if (Contain3) {
                flag = 1 << 4;
            } else {
                flag = (1 << (Is3 ? 1 : 0)) | (1 << (Is7 ? 3 : 0));
            }
        } else {
            if (Contain5) {
                flag = (1 << (Is5 ? 2 : 0)) | (1 << (Is7 ? 3 : 0));
            } else if (Contain3) {
                flag = 1 << 4;
            } else {
                flag = (1 << (Is3 ? 1 : 0)) | (1 << (Is5 ? 2 : 0)) | (1 << (Is7 ? 3 : 0));
            }
        }
        flag &= (~1);
//        System.out.println(Integer.toBinaryString(flag));
        switch (flag) {
            case contain3:
            case fizz:
                result = FIZZ;
                break;
            case buzz:
                result = BUZZ;
                break;
            case whizz:
                result = WHIZZ;
                break;
            case fizzbuzz:
                result = FIZZ + BUZZ;
                break;
            case fizzwhizz:
                result = FIZZ + WHIZZ;
                break;
            case buzzwhizz:
                result = BUZZ + WHIZZ;
                break;
            case fizzbuzzwhizz:
                result = FIZZ + BUZZ + WHIZZ;
                break;
            default:
                break;

        }


        return result;
    }
}
