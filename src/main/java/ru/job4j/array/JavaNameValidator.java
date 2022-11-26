package ru.job4j.array;

public class JavaNameValidator {

    @SuppressWarnings("checkstyle:InnerAssignment")
    public static boolean isNameValid(String name) {
        boolean rsl = true;
        if (name.isEmpty()) {
            rsl = false;
        }
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (i == 0) {
                if (Character.isUpperCase(code) || Character.isDigit(code)) {
                    rsl = false;
                }
            } else {
                if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)
                        || Character.isDigit(code)) {
                    rsl = true;
                }
            }
            if (!rsl) {
                break;
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