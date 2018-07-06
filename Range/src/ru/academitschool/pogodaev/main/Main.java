package ru.academitschool.pogodaev.main;

import ru.academitschool.pogodaev.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало первого интервала: ");
        double fromFirstInterval = scanner.nextDouble();
        System.out.println("Введите конец первого интервала: ");
        double toFirstInterval = scanner.nextDouble();
        System.out.println("Введите начало второго интервала: ");
        double fromSecondInterval = scanner.nextDouble();
        System.out.println("Введите конец второго интервала: ");
        double toSecondInterval = scanner.nextDouble();
        System.out.println("Введите проверяемое число: ");
        double number = scanner.nextDouble();

        Range firstInterval = new Range(fromFirstInterval, toFirstInterval);
        Range secondInterval = new Range(fromSecondInterval, toSecondInterval);

        firstInterval.setFrom(fromFirstInterval);
        firstInterval.setTo(toFirstInterval);
        secondInterval.setFrom(fromSecondInterval);
        secondInterval.setTo(toSecondInterval);

        System.out.println("Длина первого интервала: " + firstInterval.getLength());
        System.out.println("Длина второго интервала: " + secondInterval.getLength());

        if (firstInterval.isInside(number)) {
            System.out.println("Проверяемое число в первом интервале");
        }

        if (secondInterval.isInside(number)) {
            System.out.println("Проверяемое число во втором интервале");
        }
    }
}
