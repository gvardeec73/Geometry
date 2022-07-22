package figures;

public class Pentagon extends Polygon{
    {
        figureName = "Пятиугольник";
        sidesNumber = 5;

    }

    public Pentagon(int sidesNumber, double side) {
        super(sidesNumber, side);
    }

    public Pentagon (double side) {
        this.side = side;
        perimeter = calcPerimeter();
        area = calcArea();
        counter ++;
        id = counter;
    }

    @Override
    public void setSidesNumber(int sidesNumber) {
        if (sidesNumber != 5) System.out.println("У пятиугольника не может быть " + sidesNumber + " сторон");
        else System.out.println("Это пятиугольник и есть :)");
    }

    @Override
    public double calcArea() {
        System.out.println("Считаем площадь пятиугольника");
        return Math.pow(side,2) / 4 * Math.sqrt(25 + 10 * Math.sqrt(5));

    }
}
