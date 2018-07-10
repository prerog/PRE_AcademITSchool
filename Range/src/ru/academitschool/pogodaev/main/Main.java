package ru.academitschool.pogodaev.main;

import ru.academitschool.pogodaev.range.Range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double fromFirstInterval = 2;
        double toFirstInterval = 5;
        double fromSecondInterval = 3;
        double toSecondInterval = 8;
        double number = 4;

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

        double fromInsertionInterval = Range.getIntersectionFrom(firstInterval, secondInterval);
        double toInsertionInterval = Range.getIntersectionTo(firstInterval, secondInterval);

        Range insertionInterval = new Range(fromInsertionInterval, toInsertionInterval);
        System.out.println("Пересечение интервалов " + insertionInterval.getLength());
    }
}
