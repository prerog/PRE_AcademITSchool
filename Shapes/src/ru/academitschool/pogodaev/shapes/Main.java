package ru.academitschool.pogodaev.shapes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape firstRectangle = new Rectangle(2, 3);
        Shape secondRectangle = new Rectangle(5.5, 2.1);

        Shape firstSquare = new Square(5);
        Shape secondSquare = new Square(6.6);

        Shape firstCircle = new Circle(3);
        Shape secondCircle = new Circle(4.2);

        Shape firstTriangle = new Triangle(3, 2.3, 3, 5.3, 5.2, 2);
        Shape secondTriangle = new Triangle(2.6, 1, 0.5, 7.3, 1.2, 7);

        System.out.println("Ширина треугольника " + firstTriangle.getWidth());
        System.out.println("Площадь треугольника " + firstTriangle.getArea());
        System.out.println("Периметр треугольника " + firstTriangle.getPerimeter());

        public double findMaxArea() {
            double[] shapesAreasArray = {
                    firstRectangle.getArea(),
                    secondRectangle.getArea(),
                    firstSquare.getArea(),
                    secondSquare.getArea(),
                    firstCircle.getArea(),
                    secondCircle.getArea(),
                    firstTriangle.getArea(),
                    secondTriangle.getArea()
            };

            Arrays.sort(shapesAreasArray);
            double maxShapeArea = shapesAreasArray[7];
            return maxShapeArea;
        }
        System.out.println("Наибольшая площадь фигуры " + maxShapeArea);
    }
}
