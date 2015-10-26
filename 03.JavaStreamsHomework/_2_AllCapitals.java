import java.io.*;

public class _2_AllCapitals {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("res/Problem2File.txt")
        );

        String text = "";
        String temp;

        while((temp = bufferedReader.readLine()) != null){
            text += temp.toUpperCase() + "\r\n";
        }

        PrintWriter printWriter = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("res/Problem2File.txt")
                )
        );

        printWriter.write(text);
        printWriter.flush();
        bufferedReader.close();
        printWriter.close();
    }
}
