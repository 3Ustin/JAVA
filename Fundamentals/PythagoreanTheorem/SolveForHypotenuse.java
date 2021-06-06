import java.lang.reflect.Constructor;

public class SolveForHypotenuse{
    double a;
    double b;

    public SolveForHypotenuse(double A, double B){
        a = A;
        b = B;
    }

    public double solveForHypo(){
        return Math.sqrt(a*a + b*b);
    }

}
