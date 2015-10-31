import java.util.Scanner;

public class _3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().trim().split(" ");
        int currentLongest = 1;
        int longest = 1;
        String biggestWord = words[0];

        for(int i = 1; i < words.length; i++){
            String currentWord = words[i];
            String previousWord= words[i-1];

            if(currentWord.equals(previousWord)){
                currentLongest++;
            } else{
                currentLongest = 1;
            }

            if(currentLongest > longest){
                longest = currentLongest;
                biggestWord = currentWord;
            }
        }

        for(int i = 0; i < longest; i++){
            System.out.print(biggestWord + " ");
        }
    }
}