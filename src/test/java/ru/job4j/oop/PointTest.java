package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when22to44then2dot82() {
        Point a = new Point(2, 2);
        Point b = new Point(4, 4);
        double dist = a.distance(b);
        double expected = 2.82;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when32to65then4dot24() {
        Point a = new Point(3, 2);
        Point b = new Point(6, 5);
        double dist = a.distance(b);
        double expected = 4.24;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when888to222then10dot39() {
        Point a = new Point(8, 8, 8);
        Point b = new Point(2, 2, 2);
        double dist = a.distance3d(b);
        double expected = 10.39;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when876to654then3dot46() {
        Point a = new Point(8, 7, 6);
        Point b = new Point(6, 5, 4);
        double dist = a.distance3d(b);
        double expected = 3.46;
        Assert.assertEquals(expected, dist, 0.01);
    }
}