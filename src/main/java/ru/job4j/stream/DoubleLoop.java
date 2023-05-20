package ru.job4j.stream;

import java.util.stream.Stream;

public class DoubleLoop {
    public static void main(String[] args) {
        String[] levels = {"level 1", "level 2", "level 3"};
        String[] tasks = {"task 1", "task 2", "task 3", "task 4"};
        Stream.of(levels)
                .flatMap(level -> Stream.of(tasks)
                        .map(task -> level + " " + task))
                .forEach(System.out::println);

        System.out.println();

        String[] levels1 = {"level 1", "level 2", "level 3"};
        String[] tasks1 = {"task 1", "task 2", "task 3", "task 4"};
        for (String level : levels1) {
            for (String task : tasks1) {
                System.out.println(level + " " + task);
            }
        }
    }
}
