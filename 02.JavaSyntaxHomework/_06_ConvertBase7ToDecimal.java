import java.util.Scanner;
public class _6_ConvertBase7ToDecimal {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        System.out.println(Integer.valueOf(n, 7));
    }

}
