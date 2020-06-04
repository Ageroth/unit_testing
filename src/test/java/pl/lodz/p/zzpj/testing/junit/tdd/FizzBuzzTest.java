package pl.lodz.p.zzpj.testing.junit.tdd;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testGetFizzBuzzNumber() {
        Assert.assertEquals("Fizz", fizzBuzz.getFizzBuzzNumber(3));
        Assert.assertEquals("Buzz", fizzBuzz.getFizzBuzzNumber(5));
        Assert.assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzNumber(15));
        Assert.assertEquals("4", fizzBuzz.getFizzBuzzNumber(4));
    }
}
