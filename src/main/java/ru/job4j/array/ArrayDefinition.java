package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("������ ������� short �����: " + ages.length);
        String[] surname = new String[100500];
        System.out.println("������ ������� String �����: " + surname.length);
        float[] prices = new float[40];
        System.out.println("������ ������� float �����: " + prices.length);
    }
}
