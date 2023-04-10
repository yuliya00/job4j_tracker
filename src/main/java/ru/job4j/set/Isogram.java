package ru.job4j.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        String[] symbol = s.split("");
        Set<String> rsl = new HashSet<>();
        Collections.addAll(rsl, symbol);
        return rsl.size() == symbol.length;
    }
}
