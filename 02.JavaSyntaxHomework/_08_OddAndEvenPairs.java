import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class _8_OddAndEvenPairs {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();

        if(nums.length % 2 != 0){
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < nums.length; i+=2) {
                int n1 = Integer.parseInt(nums[i]);
                int n2 = Integer.parseInt(nums[i + 1]);
                if(n1 % 2 == 0 && n2 % 2 == 0){
                    System.out.printf("%s, %s -> both are even", n1, n2);
                    System.out.println();
                } else if(n1 % 2 != 0 && n2 % 2 != 0){
                    System.out.printf("%s, %s -> both are odd", n1, n2);
                    System.out.println();
                } else {
                    System.out.printf("%s, %s -> different", n1, n2);
                    System.out.println();
                }
            }
        }
    }
}
