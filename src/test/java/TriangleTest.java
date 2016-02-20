import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rfraga on 2/20/16.
 */
public class TriangleTest {

    @Test
    public void ShouldDrawDot() throws Exception {
        Triangle triangle = new Triangle();
        String expectedDot = "*";
        assertThat(triangle.drawDot(),is(expectedDot));
    }

    @Test
    public void testDrawLine() throws Exception {

    }

    @Test
    public void testDrawVertical() throws Exception {

    }

    @Test
    public void testDrawRightTriangle() throws Exception {

    }
}