package sanekp.epam.problem01;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class Ring extends Shape {
    private double r;

    public Ring(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
