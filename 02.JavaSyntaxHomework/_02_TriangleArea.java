import java.util.Scanner;
public class _2_TriangleArea {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int ax = scan.nextInt();
        int ay = scan.nextInt();
        int bx = scan.nextInt();
        int by = scan.nextInt();
        int cx = scan.nextInt();
        int cy = scan.nextInt();

        int result = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2;

        if(result == 0){
            System.out.println("0");
        } else if(result < 0){
            System.out.println(result * -1);
        } else {
            System.out.println(result);
        }

    }
}
