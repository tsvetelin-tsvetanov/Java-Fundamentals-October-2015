import java.util.Scanner;

public class _6_CountSpecifiedWord {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().trim().split("\\W");
        String targetWord = scan.nextLine();
        int counter = 0;

        for(String str : input){
            if(str.toLowerCase().equals(targetWord)){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
