package figures.triangles;

import figures.Figure;

public class Triangle extends Figure {
    double sideA;
    double sideB;
    double sideC;

    static {
        figureName = "Треугольник";
    }


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    @Override
    public String toString() {
        String s1 = "Экземпляр: " + id;
        String s2 = ", Название фигуры: " + figureName;
        String s3 = ", Длина стороны А: " + sideA;
        String s4 = ", Длина стороны B: " + sideB;
        String s5 = ", Длина стороны С: " + sideC;
        String s6 = String.format(", Периметр: %.1f", perimeter);
        String s7 = String.format(", Площадь: %.1f", area);
        return s1 + s2 + s3 + s4 + s5 + s6 + s7;
    }


    @Override
    public double calcArea() {
            double p = perimeter/2;
            double S = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            if (S <= 0) {
                System.out.println("Такого треугольника не существует");
                S = 0;
            }
            return S;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    }
}
