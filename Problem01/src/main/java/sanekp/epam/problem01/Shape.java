package sanekp.epam.problem01;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public abstract class Shape {
    public static double summarize(Shape... shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }

    public abstract double getArea();

    public double add(Shape shape) {
        return getArea() + shape.getArea();
    }
}
