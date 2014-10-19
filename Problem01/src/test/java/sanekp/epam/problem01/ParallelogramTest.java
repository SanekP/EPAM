package sanekp.epam.problem01;

import org.hamcrest.core.IsEqual;
import org.hamcrest.number.IsCloseTo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class ParallelogramTest {
    @Test
    public void testGetArea() {
        Parallelogram parallelogram = new Parallelogram(3, 7, 1);
        double area = parallelogram.getArea();
        Assert.assertThat(area, IsCloseTo.closeTo(17.6, .1));
    }

    @Test
    public void testAdd() {
        Parallelogram first = new Parallelogram(3, 7, 1);
        Parallelogram second = new Parallelogram(5, 9, 1.5);
        double sum = first.add(second);
        Assert.assertThat(sum, IsCloseTo.closeTo(62.5, 1));
        double contra = second.add(first);
        Assert.assertThat(sum, IsEqual.equalTo(contra));
    }
}
