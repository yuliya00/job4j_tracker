package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] rsl = left.split("\\.");
        String[] rsl1 = right.split("\\.");
        return Integer.compare(Integer.parseInt(rsl[0]), Integer.parseInt(rsl1[0]));
    }
}
