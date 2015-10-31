import java.math.BigInteger;
import java.util.Scanner;

public class _16_CalculateN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger factorial = BigInteger.ONE;
        factorial = recursion(n);
        System.out.println(factorial);
    }

    private static BigInteger recursion(int n){
        BigInteger result;
        if(n==0||n==1){
            result = BigInteger.ONE;
        } else if (n > 1){
            result = recursion(n-1).multiply(BigInteger.valueOf(n));
        } else {
            result = BigInteger.ZERO;
        }

        return  result;
    }
}
