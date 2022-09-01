package ru.job4j.poly;

public interface Transport {
    void go();

    int passengers(int passengers);

    int refuel(int fuel, int price);

}
