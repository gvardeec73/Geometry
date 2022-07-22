package figures;

public class Circle extends Figure{
    double radius;


    static {
        figureName = "Круг";
    }

    public Circle(double radius) {
        this.radius = radius;
        perimeter = calcPerimeter();
        area = calcArea();
        counter ++;
        id = counter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    @Override
    public String toString() {
        String s1 = "Экземпляр: " + id;
        String s2 = ", Название фигуры: " + figureName;
        String s4 = ", Радиус: " + radius;
        String s5 = String.format(", Длина окружности: %.1f", perimeter);
        String s6 = String.format(", Площадь: %.1f", area);
        return s1 + s2  + s4 + s5 + s6;
    }
    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
