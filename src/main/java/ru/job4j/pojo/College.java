package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student first = new Student();
        first.setName("Yuliya E.V.");
        first.setGroup(44);
        first.setAcceptance(new Date());

        System.out.println("Student " + first.getName() + ", group " + first.getGroup() + ", date of admission to the group " + first.getAcceptance());
    }
}
