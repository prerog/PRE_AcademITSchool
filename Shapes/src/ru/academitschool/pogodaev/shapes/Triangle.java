package ru.academitschool.pogodaev.shapes;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double getMin(double[] arr) {
        double min = Math.abs(arr[0]);
        for (double arrElement : arr) {
            if (Math.abs(arrElement) < min) {
                min = Math.abs(arrElement);
            }
        }
        return min;
    }

    private double getMax(double[] arr) {
        double max = Math.abs(arr[0]);
        for (double arrElement : arr) {
            if (Math.abs(arrElement) > max) {
                max = Math.abs(arrElement);
            }
        }
        return max;
    }

    private double[] xArray = {x1, x2, x3};
    private double[] yArray = {y1, y2, y3};

    @Override
    public double getHeight() {
        return getMax(yArray) - getMin(yArray);
    }

    @Override
    public double getWidth() {
        return getMax(xArray) - getMin(xArray);
    }

    private double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    private double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    private double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double halfP = (a + b + c) / 2;

        double epsilon = 1.0e-10;
        if (Math.abs(halfP - a) <= epsilon || Math.abs(halfP - b) <= epsilon || Math.abs(halfP - c) <= epsilon) {
            return 0;
        } else {
            return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        }
    }
}