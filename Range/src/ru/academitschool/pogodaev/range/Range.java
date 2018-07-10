package ru.academitschool.pogodaev.range;

import javax.print.attribute.standard.RequestingUserName;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getFrom() {
        return from;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    private static double getMin(double a, double b) {
        return a < b ? a : b;
    }

    private static double getMax(double a, double b) {
        return a > b ? a : b;
    }

    public static double getIntersectionFrom(Range range1, Range range2) {
        return getMax(range1.getFrom(), range2.getFrom());
    }

    public static double getIntersectionTo(Range range1, Range range2) {
        return getMin(range1.getTo(), range2.getTo());
    }

    public static void isInsertion(Range range1, Range range2){
        boolean isInsertion = false;
        if (range2.getFrom() > range1.getTo() || range2.getTo() < range1.getFrom()){
            isInsertion = true;
        }
    }

    public double getAssociation(Range range1, Range range2) {
        return 0;
    }

    public double getDifference(Range range1, Range range2) {
        return 0;
    }
}