import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void shouldPrintDot() throws Exception {
        Diamond diamond = new Diamond();
        String expectedDot = diamond.drawDot();
        assertThat(expectedDot, is("*"));
    }

    @Test
    public void shouldDrawLine() throws Exception {

    }

    @Test
    public void shouldDrawIsoceles() throws Exception {

    }

    @Test
    public void shouldDrawDiamond() throws Exception {

    }

    @Test
    public void shouldDrawDiamondwithName() throws Exception {

    }
}