package ru.job4j.array;

public class JavaNameValidator {

     public static boolean isNameValid(String name) {

        if (name.isEmpty() || Character.isUpperCase(name.codePointAt(0))
                || Character.isDigit(name.codePointAt(0))) {
            return false;
        }
         boolean rsl = true;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isNoSpecialSymbol(code) && isNoUpperLatinLetter(code) && isNoLowerLatinLetter(code)
                    && !Character.isDigit(code)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private static boolean isNoSpecialSymbol(int code) {
        return code != 36 || code != 95;
    }

    private static boolean isNoUpperLatinLetter(int code) {
        return code < 65 && code > 90;
    }

    private static boolean isNoLowerLatinLetter(int code) {
        return code < 97 && code > 122;
    }
}