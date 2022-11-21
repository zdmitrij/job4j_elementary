package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int minimallength = word.length;
        if (pref.length <= word.length) {
            minimallength = pref.length;
        }
        for (int index = 0; index <= minimallength - 1; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}