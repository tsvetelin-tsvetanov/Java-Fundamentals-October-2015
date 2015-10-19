import java.util.Scanner;
public class _6_SumNumbersFrom1ToN {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int index = 0;
        while (index <= n){
            sum += index;
            index++;
        }

        System.out.println(sum);
    }
}
