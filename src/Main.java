import figures.*;

public class Main {
    public static void main(String[] args) {
        Polygon polly = new Polygon(5,5);
        System.out.println(polly);
        Polygon pol = new Polygon(6, 5);
        System.out.println(pol);
        pol.setSide(6);
        System.out.println(pol);
        Pentagon pentagon = new Pentagon(5);
        System.out.println(pentagon);
        pentagon.setSidesNumber(8);
        pentagon.setSidesNumber(5);
        pentagon.setSide(4);
        System.out.println(pentagon);
        Hexagon hexagon = new Hexagon(5);
        System.out.println(hexagon);
        hexagon.setSidesNumber(8);
        hexagon.setSidesNumber(6);
        hexagon.setSide(6);
        System.out.println(hexagon);

        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.setRadius(8);
        System.out.println(circle);

        Oval oval = new Oval(5, 3);
        System.out.println(oval);
        oval.setRadius_R(7);
        System.out.println(oval);

    }
}
