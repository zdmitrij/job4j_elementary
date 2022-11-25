package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean rsl = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (i == 0) {
                rsl = !Character.isUpperCase(code) && !Character.isDigit(code);
            } else {
                rsl = isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)
                    || Character.isDigit(code);
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}