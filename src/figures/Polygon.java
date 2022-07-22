package figures;

public class Polygon extends Figure {
    double side;
    int sidesNumber;


    static {
        figureName = "Полигон";
    }

    public Polygon() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    public int getSidesNumber() {
        return sidesNumber;
    }

    public void setSidesNumber(int sidesNumber) {
        this.sidesNumber = sidesNumber;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    public int getId() {
        return id;
    }



    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Polygon.counter = counter;
    }

    public Polygon(int sidesNumber, double side) {
        this.side = side;
        this.sidesNumber = sidesNumber;
        perimeter = calcPerimeter();
        area = calcArea();
        counter ++;
        id = counter;
    }

    @Override
    public String toString() {
        String s1 = "Экземпляр: " + id;
        String s2 = ", Название фигуры: " + figureName;
        String s3 = ", Число сторон: " + sidesNumber;
        String s4 = ", Длина стороны: " + side;
        String s5 = String.format(", Периметр: %.1f", perimeter);
        String s6 = String.format(", Площадь: %.1f", area);
        return s1 + s2 + s3 + s4 + s5 + s6;
    }



    @Override
    public double calcArea() {
        double rad = 180.0 / sidesNumber * Math.PI/180;
        double r = side / (2 * Math.tan(rad));
        double P = calcPerimeter();
        return (P * r) / 2;

    }

    @Override
    public double calcPerimeter() {
        return side * sidesNumber;
    }
}
