import java.text.DecimalFormat;
import java.util.Scanner;
public class _3_FormattingNumbers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        DecimalFormat dfb = new DecimalFormat("0.00");
        DecimalFormat dfc = new DecimalFormat("0.000");

        //a to hex
        String result = "|" + Integer.toHexString(a);
        while(result.length() < 10){
            result += " ";
        }
        //a to binary
        result += "|" + String.format("%10s",
                Integer.toBinaryString(a)).replace(' ', '0');

        //b
        result += "|" + String.format("%10s", dfb.format(b));
        //c
        result += "|" + String.format("%-10s", dfc.format(c)) +  "|";
        System.out.println(result);

    }
}
