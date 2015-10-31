import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _8_ExtractEmails {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("((?<=\\s|^)([^-._\\s][\\w\\.\\-]+@[\\w-]+\\.[\\w\\.]+))");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
