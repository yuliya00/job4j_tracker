package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] rsl = s.split(" ");
        for (String object : rsl) {
            if (words.contains(object)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}


