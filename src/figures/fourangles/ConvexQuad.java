package figures.fourangles;

public class ConvexQuad extends Quadrilateral{
    static {
        figureName = "Выпуклый четырехугольник";
    }
    public ConvexQuad(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);
    }
}
