import java.util.Scanner;
public class _9_HitTheTarget {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //add
        for(int i = 1; i < 21; i++){
            for(int j = 1; j < 21; j++){
                if(i + j == n){
                    System.out.printf("%s + %s = %s", i, j, n);
                    System.out.println();
                }
            }
        }

        //substract
        for(int i = 1; i < 21; i++){
            for(int j = 1; j < 21; j++){
                if(i - j == n){
                    System.out.printf("%s - %s = %s", i, j, n);
                    System.out.println();
                }
            }
        }
    }
}
