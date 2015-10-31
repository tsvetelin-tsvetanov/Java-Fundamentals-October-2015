import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _14_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for(int i = 0; i < input.length; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }

        String order = scan.nextLine();

        numbers = Arrays.stream(numbers).sorted().toArray();
        if(order.toLowerCase().equals("ascending")){
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i] + " ");
            }
        } else {
            for(int i = numbers.length - 1; i > -1; i--){
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
