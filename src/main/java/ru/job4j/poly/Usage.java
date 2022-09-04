package ru.job4j.poly;

public class Usage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle bus1 = new Bus1();
        Vehicle helicopter = new Plane();
        Vehicle car = new Bus1();
        Vehicle tram = new Train();

        Vehicle[] vehicles = new Vehicle[] {train, plane, bus1, helicopter, car, tram};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
