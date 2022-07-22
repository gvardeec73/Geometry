package figures;

import figures.Polygon;

public class Hexagon extends Polygon {
    {
        figureName = "Шестиугольник";
        sidesNumber = 6;

    }

    public Hexagon(int sidesNumber, double side) {
        super(sidesNumber, side);
    }

    public Hexagon (double side) {
        this.side = side;
        perimeter = calcPerimeter();
        area = calcArea();
        counter ++;
        id = counter;
    }

    @Override
    public void setSidesNumber(int sidesNumber) {
        if (sidesNumber != 6) System.out.println("У шестиугольника не может быть " + sidesNumber + " сторон");
        else System.out.println("Это шестиугольник и есть :)");
    }

    @Override
    public double calcArea() {
        System.out.println("Считаем площадь шестиугольника");
        Double S = (Math.pow(side,2) * 3 * Math.sqrt(3)) / 2 ;
        System.out.println(S);
        return S;
    }
}
