package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("������ ������� short �����: " + ages.length);
        String[] surname = new String[100500];
        System.out.println("������ ������� String �����: " + surname.length);
        float[] prices = new float[40];
        System.out.println("������ ������� float �����: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Misha";
        names[2] = "Tolik";
        names[3] = "Marina";
        System.out.println("������ 1 � �������� 0 �������� ���: " + names[0]);
        System.out.println("������ 2 � �������� 1 �������� ���: " + names[1]);
        System.out.println("������ 3 � �������� 2 �������� ���: " + names[2]);
        System.out.println("������ 4 � �������� 3 �������� ���: " + names[3]);
    }
}
