package pl.lodz.p.zzpj.testing.junit.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {
    SimpleCalculator simpleCalculator = new SimpleCalculator();
    double x = 9;
    double y = 3;

    @Test
    public void testAdd() {
        Assert.assertEquals(12, simpleCalculator.add(x, y), 0);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(6, simpleCalculator.subtract(x, y), 0);
    }

    @Test
    public void testDivide() throws CannotDivideByZeroException {
        Assert.assertEquals(3, simpleCalculator.divide(x, y), 0);
    }

    @Test
    public void testSquareRootCalculation() throws CannotCalculateSquareRootOfNegativeNumber {
        Assert.assertEquals(3, simpleCalculator.calculateSquareRoot(x), 0);
    }

    @Test
    public void testModulo() {
        Assert.assertEquals(0, simpleCalculator.modulo((int) x, (int) y));
    }
}