package sanekp.epam.problem01;

import org.hamcrest.core.IsEqual;
import org.hamcrest.number.IsCloseTo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class TrapeziumTest {
    @Test
    public void testGetArea() {
        Trapezium trapezium = new Trapezium(2, 5, 3, 4);
        double area = trapezium.getArea();
        Assert.assertThat(area, IsCloseTo.closeTo(10.4, .1));
    }

    @Test
    public void testAdd() {
        Trapezium first = new Trapezium(2, 5, 3, 4);
        Trapezium second = new Trapezium(6, 9, 7, 8);
        double sum = first.add(second);
        Assert.assertThat(sum, IsCloseTo.closeTo(62.4, 1));
        double contra = second.add(first);
        Assert.assertThat(sum, IsEqual.equalTo(contra));
    }
}
