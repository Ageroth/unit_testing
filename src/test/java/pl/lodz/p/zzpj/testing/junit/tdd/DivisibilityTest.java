package pl.lodz.p.zzpj.testing.junit.tdd;

import org.junit.Assert;
import org.junit.Test;

public class DivisibilityTest {
    private final Divisibility divisibility = new Divisibility();

    @Test
    public void testDivisibility() {
        Assert.assertTrue(divisibility.isDivisible(9, 3));
        Assert.assertFalse(divisibility.isDivisible(9,4));
    }
}
