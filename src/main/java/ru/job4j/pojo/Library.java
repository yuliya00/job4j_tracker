package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Harry Potter", 45);
        Book two = new Book("Clean code", 150);
        Book three = new Book("Cinderella", 120);
        Book four = new Book("Spider-Man", 180);
        Book[] read = new Book[4];
        read[0] = one;
        read[1] = two;
        read[2] = three;
        read[3] = four;
        for (int i = 0; i < read.length; i++) {
            Book bk = read[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println("List 2");
        Book t = read[0];
        read[0] = read[3];
        read[3] = t;
        for (int i = 0; i < read.length; i++) {
            Book bk = read[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println("List 3");
        for (int i = 0; i < read.length; i++) {
            Book bk = read[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName());
            }
        }
    }
}
