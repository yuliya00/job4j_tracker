package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int v) {
        return sum(v) + multiply(v) + minus(v) + divide(v);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int result1 = Calculator.minus(10);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int aaa = calculator.divide(50);
        System.out.println(aaa);
        int end = calculator.sumAllOperation(50);
        System.out.println(end);
    }
}
