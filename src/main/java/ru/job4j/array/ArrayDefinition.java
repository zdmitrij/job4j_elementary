package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива short равен: " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива String равен: " + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива float равен: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Misha";
        names[2] = "Tolik";
        names[3] = "Marina";
        System.out.println("Ячейка 1 с индексом 0 содержит имя: " + names[0]);
        System.out.println("Ячейка 2 с индексом 1 содержит имя: " + names[1]);
        System.out.println("Ячейка 3 с индексом 2 содержит имя: " + names[2]);
        System.out.println("Ячейка 4 с индексом 3 содержит имя: " + names[3]);
    }
}
