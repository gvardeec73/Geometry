package figures;

public class Oval extends Figure{
    double radius_R;
    double radius_r;

    static {
        figureName = "Овал (Эллипс)";
    }

    public Oval(double radius_R, double radius_r) {
        this.radius_R = radius_R;
        this.radius_r = radius_r;
        perimeter = calcPerimeter();
        area = calcArea();
        counter ++;
        id = counter;
    }

    public double getRadius_R() {
        return radius_R;
    }

    public void setRadius_R(double radius_R) {
        this.radius_R = radius_R;
        perimeter = calcPerimeter();
        area = calcArea();
    }

    public double getRadius_r() {
        return radius_r;
    }

    public void setRadius_r(double radius_r) {
        this.radius_r = radius_r;
        perimeter = calcPerimeter();
        area = calcArea();
    }
    @Override
    public String toString() {
        String s1 = "Экземпляр: " + id;
        String s2 = ", Название фигуры: " + figureName;
        String s3 = ", Радиус R: " + radius_R;
        String s4 = ", Радиус r: " + radius_r;
        String s5 = String.format(", Длина окружности: %.1f", perimeter);
        String s6 = String.format(", Площадь: %.1f", area);
        return s1 + s2  + s3 +  s4 + s5 + s6;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius_R * radius_r;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(radius_R,2) + Math.pow(radius_r,2)) / 2);
    }
}
