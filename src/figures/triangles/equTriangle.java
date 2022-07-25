package figures.triangles;

public class equTriangle extends Triangle {
    static {
        figureName = "Равносторонний треугольник";
    }


    public equTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public equTriangle(double sideA) {
        super(sideA, sideA, sideA);
    }

    @Override
    public void setSideA(double sideA) {
        sideB = sideA;
        sideC = sideA;
        super.setSideA(sideA);
    }

    @Override
    public void setSideB(double sideB) {
        sideA = sideB;
        sideC = sideB;
        super.setSideB(sideB);
    }

    @Override
    public void setSideC(double sideC) {
        sideA = sideC;
        sideB = sideC;
        super.setSideC(sideC);
    }
}
