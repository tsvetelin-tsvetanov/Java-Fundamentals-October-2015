import org.omg.CORBA.INTERNAL;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardFrequencies {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().trim().split("\\W+");
        Map<String, Integer> result = new LinkedHashMap<>();

        for(String str : input){
            if(!result.containsKey(str)){
                result.put(str, 1);
            } else {
                result.put(str,
                        result.get(str) + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : result.entrySet()){
            double percent = ((double)entry.getValue() / input.length) * 100;
            System.out.printf("%s -> %.2f%%", entry.getKey(), percent);
            System.out.println();
        }
    }
}
