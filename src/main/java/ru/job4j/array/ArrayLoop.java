package ru.job4j.array;

import java.sql.SQLOutput;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int level:numbers) {
            System.out.println(level);
        }
    }
}