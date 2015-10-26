import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _4_CopyJPGFile {
    public static void main(String args[]) throws IOException{
        FileInputStream inputStream = new FileInputStream(
                new File("res/grumpy-cat.jpg")
        );
        FileOutputStream outputStream = new FileOutputStream(
                new File("res/copied-image.jpg")
        );
        int byteContainer;
        while((byteContainer=inputStream.read()) != -1){
            outputStream.write(byteContainer);
        }
        inputStream.close();
        outputStream.close();
    }
}
