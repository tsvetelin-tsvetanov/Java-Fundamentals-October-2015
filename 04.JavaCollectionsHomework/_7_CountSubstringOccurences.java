import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class _7_CountSubstringOccurences {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().trim().split("\\W");
        String targetWord = scan.nextLine().toLowerCase();
        int counter = 0;

        for(String str : input){
            if(str.toLowerCase().contains(targetWord)){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
