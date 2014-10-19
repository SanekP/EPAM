package sanekp.epam.problem01;

import org.hamcrest.core.IsEqual;
import org.hamcrest.number.IsCloseTo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanek_000 on 10/19/2014.
 */
public class TriangleTest {
    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        double area = triangle.getArea();
        Assert.assertThat(area, IsCloseTo.closeTo(6, .01));
    }

    @Test
    public void testAdd() {
        Triangle first = new Triangle(3, 4, 5);
        Triangle second = new Triangle(6, 7, 8);
        double sum = first.add(second);
        Assert.assertThat(sum, IsCloseTo.closeTo(26, 1));
        double contra = second.add(first);
        Assert.assertThat(sum, IsEqual.equalTo(contra));
    }
}
