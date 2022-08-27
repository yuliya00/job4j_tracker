package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner i = new Scanner(System.in);
        String question = i.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да.");
        }
        if (answer == 1) {
            System.out.println("Нет.");
        }
        if (answer == 2) {
            System.out.println("Может быть.");
        }
    }
}
