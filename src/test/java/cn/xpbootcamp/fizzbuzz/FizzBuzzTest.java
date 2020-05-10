package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void when_give_a_num_then_say_num(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("1",fb.SayNumbers(1));
        Assert.assertEquals("2",fb.SayNumbers(2));
        Assert.assertEquals("4",fb.SayNumbers(4));
    }

    @Test
    public void when_give_a_num_divided_by_3_5_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz",fb.SayNumbers(3));
        Assert.assertEquals("Fizz",fb.SayNumbers(6));
        Assert.assertEquals("Buzz",fb.SayNumbers(5));
        Assert.assertEquals("Buzz",fb.SayNumbers(10));
        Assert.assertEquals("Whizz",fb.SayNumbers(7));
        Assert.assertEquals("Whizz",fb.SayNumbers(14));
    }

    @Test
    public void when_give_a_num_divided_by_many_nums(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("FizzBuzz",fb.SayNumbers(60));
        Assert.assertEquals("FizzWhizz",fb.SayNumbers(21));
        Assert.assertEquals("BuzzWhizz",fb.SayNumbers(140));
        Assert.assertEquals("FizzBuzzWhizz",fb.SayNumbers(210));
    }

    @Test
    public void when_give_a_num_contain_3(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz",fb.SayNumbers(13));
        Assert.assertEquals("Fizz",fb.SayNumbers(30));
    }

    @Test
    public void when_give_a_num_contain_5(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("BuzzWhizz",fb.SayNumbers(35));
        Assert.assertEquals("Buzz",fb.SayNumbers(50));
        Assert.assertEquals("BuzzWhizz",fb.SayNumbers(105));
    }

}
