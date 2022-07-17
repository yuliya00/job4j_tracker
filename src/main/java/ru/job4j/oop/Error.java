package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 100, "hello");
        error1.printInfo();
        Error error2 = new Error(true, 55, "buy");
        error2.printInfo();
        Error error3 = new Error(false, 100000, "today");
        error3.printInfo();
    }
}
