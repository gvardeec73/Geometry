package figures.triangles;

public class isoTriangle extends Triangle{

    static {
        figureName = "Равнобедренный треугольник";
    }


    public isoTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public isoTriangle(double sideA, double sideC) {
        super(sideA, sideA, sideC);
    }

    @Override
    public void setSideA(double sideA) {
        sideB = sideA;
        super.setSideA(sideA);
    }

    @Override
    public void setSideB(double sideB) {
        sideA = sideB;
        super.setSideB(sideB);
    }
}
