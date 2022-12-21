package ru.job4j.factory;

public class Trapezoid implements Shape {
    int a;
    int b;
    int h;

    public Trapezoid(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return      "   ******" + ln
                +  "  *      *" + ln
                +  " *        *" + ln
                +   " **********";
    }

    @Override
    public double square() {
        return 0.5 * (a + b) * h;
    }

}
