package figures.fourangles;

public class Parallelogram extends Quadrilateral{

    static {
        figureName = "Параллелограмм";
    }


    public Parallelogram(double sideA, double sideB) {
        super(sideA, sideB, sideA, sideB);
    }

    @Override
    public void setSideA(double sideA) {
        sideC = sideA;
        super.setSideA(sideA);
    }

    @Override
    public void setSideB(double sideB) {
        sideD = sideB;
        super.setSideB(sideB);
    }

    @Override
    public void setSideC(double sideC) {
        sideA = sideC;
        super.setSideC(sideC);
    }

    @Override
    public void setSideD(double sideD) {
        sideB = sideD;
        super.setSideD(sideD);
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }


}
