package ru.job4j.boxing;

import java.util.List;
import java.util.ArrayList;

public class Box {

    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void main(String[] args) {
        int a = 1;
        Integer b;
        b = a;
        System.out.println("Integer b = " + b);

        int x = 2;
        num(x);

        Integer sum = 0;
        for (int i = 128; i < 300; i++) {
            sum += i;
        }
        System.out.println(sum);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        Integer k = 5;
        Integer l = 6;
        System.out.println(k * l);

        Integer g = 250;
        Integer h = 250;
        System.out.println(g == h);

        Integer v = 127;
        Integer w = 127;
        System.out.println(v == w);
    }
}
