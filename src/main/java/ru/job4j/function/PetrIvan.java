package ru.job4j.function;

import java.util.Arrays;
import java.util.Comparator;

public class PetrIvan {
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);

        String[] name = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthCmp1 = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(name, lengthCmp1);
    }
}
