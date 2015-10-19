import java.util.Scanner;
public class _8_GetAverage {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        float a = Float.parseFloat(scan.next());
        float b = Float.parseFloat(scan.next());
        float c = Float.parseFloat(scan.next());
        System.out.printf("Average: %.2f", getAverage(a, b, c));
    }

    public static float getAverage(float a, float b, float c){
       float result = (a + b + c) / 3;
       return result;
    }
}
