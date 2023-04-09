package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        String[] words = s.split("");
        List<String> symbol = new ArrayList<>();
        Collections.addAll(symbol, words);
        Comparator comparator = Comparator.naturalOrder();
        symbol.sort(comparator);
        return String.join("", symbol);
    }
}
