package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int minimallength = word.length;
        if (post.length <= word.length) {
            minimallength = post.length;
        }
        for (int index = 0; index <= minimallength - 1; index++) {
            if (word[word.length - 1] != post[post.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}