import java.util.Scanner;
public class _5_ConvertDecimalToBase7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Integer.toString(n, 7));
    }
}

