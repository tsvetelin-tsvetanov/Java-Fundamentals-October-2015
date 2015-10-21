import java.lang.reflect.Array;
import java.util.*;

public class _7_RandomizeNumbersBetweenNAndM {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        if(n > m){
            int min = m;
            int max = n;
            List<Integer> numbers = new ArrayList<Integer>();
            for(int i = min; i <= max; i++){
                numbers.add(i);
            }
            Collections.shuffle(numbers);
            System.out.println(numbers);
        } else if(m > n){
            int min = n;
            int max = m;
            List<Integer> numbers = new ArrayList<Integer>();
            for(int i = min; i <= max; i++){
                numbers.add(i);
            }
            Collections.shuffle(numbers);
            System.out.println(numbers);
        } else {
            System.out.println(m);
        }
    }
}
