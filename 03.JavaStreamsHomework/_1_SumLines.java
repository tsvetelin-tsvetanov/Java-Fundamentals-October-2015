import java.io.*;
import java.util.List;

public class _1_SumLines {
    public static void main(String args[]){
        int sum = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("res/Problem1File.txt"))){
            for(String line = br.readLine(); line != null; line = br.readLine()){
                for(char a : line.toCharArray()){
                    sum += (int) a;
                }
                System.out.println(sum);
                sum = 0;
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
