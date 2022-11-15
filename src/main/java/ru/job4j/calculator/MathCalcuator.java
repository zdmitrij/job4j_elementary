package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalcuator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
        }

    public static double divisionAndDifference(double first, double second) {
        return division(first, second) + difference(first, second);
    }
    
    public static double sumAndMulyiplyAndDivisionAndDifference(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second)
                + difference(first, second);
    }

        public static void main(String[] args) {
            System.out.println("Результат расчета сложения суммы и умножения равен: " + sumAndMultiply(10, 20));
            System.out.println("Результат расчета сложения деления и разности равен: " + divisionAndDifference(10, 20));
            System.out.println("Результат расчета сложения суммы, умножения, деления и разности равен: " + sumAndMulyiplyAndDivisionAndDifference(10, 20));
        }
}
