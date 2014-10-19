package sanekp.epam.problem01;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class Parallelogram extends Shape {
    private double a;
    private double b;
    private double alpha;

    public Parallelogram(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }

    @Override
    public double getArea() {
        return a * b * Math.sin(alpha);
    }
}
