import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle = new Triangle();

    @Test
    public void ShouldDrawDot() {
        String expectedDot = "*";
        assertThat(triangle.drawDot(),is(expectedDot));
    }

    @Test
    public void DrawLineDrawsNDots() {
        String expectedLine = "***";
        assertThat(triangle.drawLine(3),is(expectedLine));
    }

    @Test
    public void DrawVerticalDrawsDotsAndBreakLine() {
        String expectedVertical = "*\n*\n*\n";
        assertThat(triangle.drawVertical(3),is(expectedVertical));
    }

    @Test
    public void DrawRightTriangleDrawsThreeLinesBetweenNewLines() {
        String expectedTriangle= "\n*\n**\n***\n";
        assertThat(triangle.drawRightTriangle(3),is(expectedTriangle));
    }
}