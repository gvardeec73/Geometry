package figures;

public abstract class Figure {
    public static String figureName;
    public double area;
    public double perimeter;
    public int id;
    public static int counter;
    static
    {
        counter = 0;
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();


}
