import figures.*;
import figures.fourangles.*;
import figures.triangles.Triangle;
import figures.triangles.equTriangle;
import figures.triangles.isoTriangle;

public class Main {
    public static void main(String[] args) {
        Polygon polly = new Polygon(5, 5);
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

        Triangle triangle = new Triangle(5, 7, 9);
        System.out.println(triangle);
        triangle.setSideB(8);
        System.out.println(triangle);

        isoTriangle triangle1 = new isoTriangle(10, 12);
        System.out.println(triangle1);
        triangle1.setSideB(8);
        System.out.println(triangle1);

        equTriangle triangle2 = new equTriangle(10);
        System.out.println(triangle2);
        triangle2.setSideA(8);
        System.out.println(triangle2);

        Quadrilateral quad = new Quadrilateral(2, 3, 5, 8);
        System.out.println(quad);
        quad.setSideA(3);
        System.out.println(quad);

        ConvexQuad convex4 = new ConvexQuad(2, 3, 5, 8);
        System.out.println(convex4);

        Parallelogram para = new Parallelogram(3, 4);
        System.out.println(para);
        para.setSideA(5);
        System.out.println(para);

        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect);
        rect.setSideB(55);
        System.out.println(rect);

        Square square = new Square(6);
        System.out.println(square);
        square.setSideA(10);
        System.out.println(square);
        square.setSideB(8);
        System.out.println(square);
        square.setSideC(12);
        System.out.println(square);
        square.setSideD(40);
        System.out.println(square);

    }
}
