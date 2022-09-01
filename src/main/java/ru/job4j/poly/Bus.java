package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
    }

    @Override
    public int passengers(int passengers) {
        return passengers;
    }

    @Override
    public int refuel(int fuel, int price) {
        return fuel * price;
    }
}
