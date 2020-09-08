package io.github.akadir.github.actions.foo;

import org.junit.Assert;
import org.junit.Test;


public class CalculateTest {

    @Test
    public void testCalculate() {
        Assert.assertEquals(5, Calculate.add(2, 3));
    }
}
