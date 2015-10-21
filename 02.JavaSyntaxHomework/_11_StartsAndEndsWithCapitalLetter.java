import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class _11_StartsAndEndsWithCapitalLetter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\b([A-Z][a-zA-Z]*[A-Z])\\b");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.printf(matcher.group() + " ");
        }
    }
}
