package ru.job4j.oop;

public class Max {

    public int max(int one, int two) {

        return Math.max(one, two);
    }

    public int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public int max(int one, int two, int three, int five) {
        return max(one, max(two, three), five);
    }

    public static void main(String[] args) {
        Max ee = new Max();
        int rsl = ee.max(3, 5, 2, 4);
        System.out.println(rsl);
    }
}
