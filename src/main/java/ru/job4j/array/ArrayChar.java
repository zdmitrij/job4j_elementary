package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int minimalLength = word.length;
        if (pref.length < word.length) {
            minimalLength = pref.length;
        }
        for (int index = 0; index <= minimalLength - 1; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}