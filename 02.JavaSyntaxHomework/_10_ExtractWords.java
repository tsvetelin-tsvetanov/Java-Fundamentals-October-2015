import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_ExtractWords {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern rgx =  Pattern.compile("[a-zA-Z]+");
        Matcher match = rgx.matcher(input);

        while(match.find()){
            System.out.printf(match.group() + " ");
        }

    }
}
