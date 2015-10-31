import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _5_CountALlWords {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().trim().split("\\W");
        List<String> result = new ArrayList<>();

        for(String str : input){
            if(str != null && str.length() > 0){
                result.add(str);
            }
        }

        System.out.println(result.size());

    }
}
