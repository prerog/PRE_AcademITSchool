package ru.academitschool.pogodaev.range;

class Range {
    private double from;
    private double to;

    Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    void setTo(double to) {
        this.to = to;
    }

    double getTo() {
        return to;
    }

    void setFrom(double from) {
        this.from = from;
    }

    double getFrom() {
        return from;
    }

    double getLength() {
        return to - from;
    }

    boolean isInside(double number) {
        return number >= from && number <= to;
    }
}