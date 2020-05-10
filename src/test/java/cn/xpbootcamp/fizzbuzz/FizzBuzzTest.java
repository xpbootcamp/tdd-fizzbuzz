package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void when_give_a_num_then_say_num(){
        int inputNum = 1;
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("1",fb.SayNumbers(inputNum));
    }
}
