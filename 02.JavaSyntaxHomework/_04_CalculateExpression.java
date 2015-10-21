import java.text.DecimalFormat;
import java.util.Scanner;
public class _4_CalculateExpression {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        DecimalFormat dfb = new DecimalFormat("0.00");

        //formula 1
        double f1 = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) /
                (Math.pow(a, 2) - Math.pow(b, 2))), (a + b + c) / Math.sqrt(c));

        //formula 2
        double f2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) -
                Math.pow(c, 3)), a - b);

        //difference
        double diff = ((f1 + f2) / 2) - ((a + b + c) / 3);

        System.out.println("F1 result: " + dfb.format(f1) +
        "; F2 result: " + dfb.format(f2) +
        "; Diff: " + dfb.format(diff));

    }
}
