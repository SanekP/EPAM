package sanekp.epam.problem01;

import org.hamcrest.core.IsEqual;
import org.hamcrest.number.IsCloseTo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class RingTest {
    @Test
    public void testGetArea() {
        Ring ring = new Ring(10);
        double area = ring.getArea();
        Assert.assertThat(area, IsCloseTo.closeTo(314, .2));
    }

    @Test
    public void testAdd() {
        Ring first = new Ring(10);
        Ring second = new Ring(42);
        double sum = first.add(second);
        Assert.assertThat(sum, IsCloseTo.closeTo(5855, 1));
        double contra = second.add(first);
        Assert.assertThat(sum, IsEqual.equalTo(contra));
    }
}
