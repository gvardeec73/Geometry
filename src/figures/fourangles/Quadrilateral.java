package figures.fourangles;

import figures.Figure;

public class Quadrilateral extends Figure {
    double sideA;
    double sideB;
    double sideC;
    double sideD;

    static {
        figureName = "Четырехугольник";
    }

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        perimeter = calcPerimeter();
        area = calcArea();
        counter ++;
        id = counter;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    @Override
    public String toString() {
        String s1 = "Экземпляр: " + id;
        String s2 = ", Название фигуры: " + figureName;
        String s3 = ", Длина стороны А: " + sideA;
        String s4 = ", Длина стороны B: " + sideB;
        String s5 = ", Длина стороны С: " + sideC;
        String s6 = ", Длина стороны D: " + sideD;
        String s7 = String.format(", Периметр: %.1f", perimeter);
        String s8 = String.format(", Площадь: %.1f", area);
        return s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8;
    }

    @Override
    public double calcArea() {
        double p = perimeter/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC) * (p - sideD));

    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}
