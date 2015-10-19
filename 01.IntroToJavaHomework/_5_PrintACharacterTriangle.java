import java.util.Scanner;

public class _5_PrintACharacterTriangle {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int index = 0;
        char ch = 'a';
        String result = "";

        while(count > index){
            result += ch + " ";
            System.out.println(result);
            index++;
            ch++;
        }

        while(count > 0){
            ch--;
            result = result.replace(String.valueOf(ch),"");
            System.out.println(result);
            count--;
        }
    }
}
