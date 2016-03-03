import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DiamondTest {

    private Diamond diamond = new Diamond();


    @Test
    public void DrawDotDrawsDot() throws Exception {
        String expectedDot = "*";
        assertThat(diamond.drawDot(), is(expectedDot));
    }

    @Test
    public void DrawLineDrawASequenceOfDotsWithArithmeticProgression() {
        String expectedLine = "*******";
        assertThat("The progression should be 1+(n-1)*2 where n = number of dots ",diamond.drawLine(4),is(expectedLine));
    }

    @Test
    public void DrawIsocelesDrawsLineWithSpacesInTheBeging() {
        String expectedIsoceles = "\n  *\n ***\n*****\n";
        assertThat(diamond.drawIsoceles(3),is(expectedIsoceles));
    }

    @Test
    public void DrawDiamondDrawsLinesWithDifferntSpacesInFrontOf() {
        String expectedDiamond = "\n  *\n ***\n*****\n ***\n  *\n";
        assertThat(diamond.drawDiamond(3),is(expectedDiamond));
    }

    @Test
    public void DrawDiamondwithNameDrawsADiamondWithANameInTheMiddle() {
        String expectDiamondWithName = "\n  *\n ***\nBOB\n ***\n  *\n";
        assertThat(diamond.drawDiamondwithName(3,"BOB"),is(expectDiamondWithName));
    }
}