package sanekp.epam.problem01;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class Trapezium extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapezium(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        return (a + b) / 4 / Math.abs(a - b) * Math.sqrt((a + c + d - b) * (a + d - b - c) * (a + c - b - d) * (b + c + d - a));
    }
}
