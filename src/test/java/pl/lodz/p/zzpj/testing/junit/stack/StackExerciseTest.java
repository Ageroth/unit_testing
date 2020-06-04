package pl.lodz.p.zzpj.testing.junit.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackExerciseTest {
    private StackExercise stackExercise;

    @Before
    public void init() {
        stackExercise = new StackExercise();
        stackExercise.push("First");
    }

    @Test
    public void testPop() throws StackEmptyException {
        stackExercise.pop();
        Assert.assertTrue(stackExercise.isEmpty());
    }

    @Test
    public void testPush() throws StackEmptyException {
        stackExercise.push("Second");
        Assert.assertEquals("Second",stackExercise.pop());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertFalse(stackExercise.isEmpty());
    }
}
