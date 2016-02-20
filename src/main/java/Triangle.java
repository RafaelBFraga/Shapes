
public class Triangle {

    public String drawDot(){
        return "*";
    }

    public String drawLine(int n){
        String line="";

        for (int i = 0; i < n; i++) {
            line += drawDot();
        }
        return line;
    }

    public String drawVertical(int n){
        String verticalLine="";

        for (int i = 0; i < n; i++) {
            verticalLine += drawDot() + "\n";
        }

        return verticalLine;
    }

    public String drawRightTriangle(int n){
        String triangle="";

        for (int i = 0; i <n+1; i++) {
            triangle += drawLine(i) + "\n";
        }

        return triangle;
    }
}
