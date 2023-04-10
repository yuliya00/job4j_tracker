package ru.job4j.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> rsl = new HashSet<>();
        Collections.addAll(rsl, combination);
        return rsl.size() == 1;
    }
}
