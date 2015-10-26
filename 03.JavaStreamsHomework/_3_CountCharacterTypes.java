import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class _3_CountCharacterTypes {
    public static void main(String args[]) throws IOException{
        String vowels = "aeiou";
        String punctuation = "!,.?";
        int consonantsCount = 0;
        int vowelsCount = 0;
        int punctuationCount = 0;
        FileInputStream inputStream = new FileInputStream(
                new File("res/Problem3File.txt")
        );
        FileWriter fileWriter = new FileWriter(
                new File("res/countChars.txt")
        );
        int symbol;
        while((symbol = inputStream.read()) != -1){
            char ch = (char) symbol;
            if(vowels.contains(ch+"")){
                vowelsCount++;
            } else if(punctuation.contains(ch+"")){
                punctuationCount++;
            } else if(Character.isLetter(ch)){
                consonantsCount++;
            }
        }

        fileWriter.write(String.format("Vowels: %d%n", vowelsCount));
        fileWriter.write(String.format("Consonants: %d%n", consonantsCount));
        fileWriter.write(String.format("Punctuation: %d%n", punctuationCount));
        fileWriter.close();
        inputStream.close();
    }
}
