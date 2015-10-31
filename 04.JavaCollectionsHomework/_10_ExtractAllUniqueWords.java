import java.util.Scanner;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\W");
        TreeSet<String> result = new TreeSet<>();

        for(String str : input){
            str = str.toLowerCase().trim();
            if(!result.contains(str)){
                result.add(str);
            }
        }

        for(String str : result){
            System.out.print(str + " ");
        }

    }
}
