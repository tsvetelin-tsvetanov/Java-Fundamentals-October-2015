import java.util.Scanner;

public class _2_SequencesOfEqualStrings {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String temp = input[0];

        for(int i = 1; i < input.length; i++ ){
            if(temp.equals(input[i])){
                System.out.print(temp + " ");
            } else {
                System.out.print(temp);
                System.out.println();
            }
            temp = input[i];
        }

        if(temp.equals(input[input.length - 1])){
            System.out.print(input[input.length - 1]);
        }else {
            System.out.println();
            System.out.print(input[input.length - 1]);
        }
    }
}
