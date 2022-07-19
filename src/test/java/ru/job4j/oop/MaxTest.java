package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax5() {
        Max one1 = new Max();
        int rsl = one1.max(3, 5, 2, 4);
        int expected = 5;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenMax200() {
        Max one2 = new Max();
        int rsl = one2.max(23, 55, 200, 40);
        int expected = 200;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenMax22() {
        Max one3 = new Max();
        int rsl = one3.max(3, 15, 22, 4);
        int expected = 22;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenMax56() {
        Max one4 = new Max();
        int rsl = one4.max(3, 56, 2, 0);
        int expected = 56;
        Assert.assertEquals(rsl, expected);
    }
}