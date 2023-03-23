package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {

    @Override
    public int compare(Item name, Item name1) {
        return name1.getName().compareTo(name.getName());
    }
}
