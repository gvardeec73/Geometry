package figures.fourangles;

public class Square extends Parallelogram{

    static {
        figureName = "Квадрат";
    }

     public Square(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public void setSideA(double sideA) {
        sideB = sideA;
        sideD = sideA;
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
        sideB = sideC;
        sideD = sideC;
        super.setSideC(sideC);

    }

    @Override
    public double calcArea() {
        return Math.pow(sideA,2);
    }

    @Override
    public void setSideD(double sideD) {
        sideA = sideD;
        sideC = sideD;
        super.setSideD(sideD);



    }
}
