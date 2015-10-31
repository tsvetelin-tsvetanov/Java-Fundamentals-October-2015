import java.util.ArrayList;
import java.util.Scanner;

public class _9_CombineListsOfLetters {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> word2Chars = new ArrayList<>();
        String output = "";

        for(char c : word2.toCharArray()){
            word2Chars.add(c);
        }

        for(char c : word1.toCharArray()){
            result.add(c);
            output += c;
        }

        for(char c : word2.toCharArray()){
            if(!(word1.indexOf(c) != -1)){
                output += " " + c;
            }
        }

        System.out.println(output);

    }
}
