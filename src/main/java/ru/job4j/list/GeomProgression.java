package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> progress = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += first * Math.pow(denominator, i - 1);
        }
        return sum;
    }
}
