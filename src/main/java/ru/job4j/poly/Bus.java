package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println(passengers);
    }

    @Override
    public int refuel(int fuel, int price) {
        return fuel * price;
    }
}
