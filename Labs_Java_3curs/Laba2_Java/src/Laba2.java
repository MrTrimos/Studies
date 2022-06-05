import java.awt.geom.*;
import java.util.*;

public class Laba2 {
    public static int colon = 4;

    public static int min = -9;
    public static int max = 9;
    public static int diff = max - min;
    public static Random random = new Random();

    public static int a = 0 , b = 0 , c = 0;


    public static void main(String[] args) {

        int[][] _masChisl = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                _masChisl[i][j] = random.nextInt(diff + 1) + min;
            }
        }

        a = _masChisl[0][0];
        b = _masChisl[0][0];
        c = _masChisl[0][0];
        for (int i = 0; i < _masChisl.length; i++){
            for (int j = 0; j < _masChisl.length; j++){

                if (a >= _masChisl[i][j]){
                    a = _masChisl[i][j];
                }

                if (b > a && b < _masChisl[i][j]){
                    b = _masChisl[i][j];
                }

                if (c > b && c < a){
                    c = _masChisl[i][j];
                }
            }
        }

        int P = a + b + c;


        for (int i = 0; i < _masChisl.length; i++) {
            for (int j = 0; j < _masChisl.length; j++) {
                System.out.print(_masChisl[i][j] + "  ");
            }
            System.out.print ("\n");
        }
        System.out.print ("\na = " + a);
        System.out.print ("\nb = " + b);
        System.out.print ("\nc = " + c);
        System.out.print ("\n\nP = a + b + c = " + P);


    }

}