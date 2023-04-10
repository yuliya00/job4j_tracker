package ru.job4j.set;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        String[] symbol = s.split("");
        Set<String> rsl = new HashSet<>();
        List<String> add = new ArrayList<>();
        for (String letter : symbol) {
            if (!letter.equals(" ")) {
                add.add(letter);
            }
        }
        rsl.addAll(add);
        return rsl.size() == 26;
    }
}
