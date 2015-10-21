import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class _13_GetFirstOddOrEvenElements {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }

        String line2 = scan.nextLine();
        String[] commandArgs = line2.split(" ");
        String command = commandArgs[2];
        int index = Integer.parseInt(commandArgs[1]);

        if(command == "odd"){
            System.out.println(getFirstOddElements(index, numbers));
        } else {
            System.out.println(getFirstEvenElements(index, numbers));
        }
    }

    public static List<Integer> getFirstOddElements(int index, int[] numbers){
        List<Integer> firstOdd = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(count == index){
                break;
            }
            if(numbers[i] % 2 != 0){
                firstOdd.add(numbers[i]);
                count++;
            }
        }

        return firstOdd;
    }

    public static List<Integer> getFirstEvenElements(int index, int[] numbers){
        List<Integer> firstEven = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(count == index){
                break;
            }
            if(numbers[i] % 2 == 0){
                firstEven.add(numbers[i]);
                count++;
            }
        }

        return firstEven;
    }
}
