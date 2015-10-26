import java.io.*;
import java.util.ArrayList;

public class _5_SaveAnArrayListOfDoubles {
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("res/Problem5File.txt")
        );
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(11.89);
        doubles.add(12345.6789);
        doubles.add(99.87654);
        outputStream.writeObject(doubles);
        outputStream.flush();
        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("res/Problem5File.txt")
        );
        System.out.println(inputStream.readObject());
        inputStream.close();
    }
}
