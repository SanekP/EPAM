package sanekp.epam.problem01;

import org.hamcrest.number.IsCloseTo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class ShapeTest {
    @Test
    public void testSummarize() {
        Ring ring = new Ring(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Parallelogram parallelogram = new Parallelogram(3, 7, 1);
        Trapezium trapezium = new Trapezium(2, 5, 3, 4);
        double sum = Shape.summarize(ring, triangle, parallelogram, trapezium);
        Assert.assertThat(sum, IsCloseTo.closeTo(348, 1));
    }

    @Test
    public void testAdd() {
        Ring ring = new Ring(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Parallelogram parallelogram = new Parallelogram(3, 7, 1);
        Trapezium trapezium = new Trapezium(2, 5, 3, 4);
        double sum = ring.add(triangle) + parallelogram.add(trapezium);
        Assert.assertThat(sum, IsCloseTo.closeTo(348, 1));
    }
}
