
public class Diamond {

    public String drawDot() {
        return "*";
    }

    public String putWhiteSpace(int n){

        String space = "";

        for (int i = 0; i < n; i++) {
            space = " "+space;
        }

        return space;
    }

    public String drawLine(int n){

        String line="";

        for (int i = 0; i < 1+(n-1)*2; i++) {
            line += drawDot();
        }
        return line;
    }

    public String drawIsoceles(int n){

        String triangle="";
        int spaces = n-1;

        for (int i = 0; i <n+1; i++) {
            triangle += drawLine(i) + "\n" + putWhiteSpace(spaces);
            spaces--;
        }

        return triangle;

    }

    public String drawDiamond(int n){

        String diamond ="";
        int space = 1;

        diamond = drawIsoceles(n);

        for (int i = n-1; i > 0; i--) {
            diamond += putWhiteSpace(space) + drawLine(i) + "\n";
            space++;
        }

        return diamond;
    }

    public String drawDiamondwithName(int n,String name){

        String diamond = drawDiamond(n);
        String middleLine = drawLine(n);
        diamond = diamond.replace(middleLine,name);
        return diamond;
    }


}
