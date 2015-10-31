import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\W+");
        TreeMap<String, Integer> result = new TreeMap<>();
        int mostFrequent = 0;

        for(String str : input){
            if(!result.containsKey(str.toLowerCase())){
                result.put(str.toLowerCase(), 1);
            } else {
                result.put(str.toLowerCase(),
                        result.get(str.toLowerCase()) + 1);
            }

            if(result.get(str.toLowerCase()) > mostFrequent){
                mostFrequent = result.get(str.toLowerCase());
            }
        }

        for(Map.Entry<String, Integer> word : result.entrySet()){
            if(word.getValue() == mostFrequent){
                System.out.printf("%s -> %d times \n",
                        word.getKey(), word.getValue());
            }
        }

    }
}
