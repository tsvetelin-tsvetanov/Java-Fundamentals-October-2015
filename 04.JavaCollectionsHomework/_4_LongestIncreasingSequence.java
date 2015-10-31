import java.util.Scanner;

public class _4_LongestIncreasingSequence {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }

        int end = 0;
        int len = 1;
        int bestLen = 1;

        System.out.print(numbers[0] + " ");
        for(int i = 1; i < numbers.length; i++)
        {
            if (numbers[i - 1] < numbers[i])
            {
                System.out.print(numbers[i] + " ");
                len++;
            }
            else
            {
                len = 1;
                System.out.println();
                System.out.print(numbers[i] + " ");
            }
            if (bestLen < len)
            {
                bestLen = len;
                end = i;
            }
        }
        System.out.println();

        System.out.print("Longest: ");
        for(int i = end - bestLen + 1; i <= end; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
