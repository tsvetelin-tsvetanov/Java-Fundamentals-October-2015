import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _13_FilterArray {
    public static void main(String args[]){
        Stream.of(new Scanner(System.in)
                .nextLine()
                .split("\\s"))
                .filter(s -> s.length() > 3)
                .forEach(e -> System.out.print(e + " "));
    }
}
