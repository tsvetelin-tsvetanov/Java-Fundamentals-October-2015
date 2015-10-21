import java.util.Scanner;

public class _12_CharacterMultiplier {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(multiplyCharacters(str1, str2));
    }

    public static int multiplyCharacters(String str1,String str2){
        int sum = 0;
        if(str1.length() > str2.length()){
            for(int i = 0; i < str2.length(); i++){
                sum += (int)str1.charAt(i) * (int)str2.charAt(i);
            }
            for(int i = str2.length(); i < str1.length(); i++){
                sum += (int)str1.charAt(i);
            }
        } else if(str2.length() > str1.length()){
            for(int i = 0; i < str1.length(); i++){
                sum += (int)str1.charAt(i) * (int)str2.charAt(i);
            }
            for(int i = str1.length(); i < str2.length(); i++){
                sum += (int)str2.charAt(i);
            }
        } else {
            for(int i = 0; i < str1.length(); i++){
                sum += (int)str1.charAt(i) * (int)str2.charAt(i);
            }
        }
        return sum;
    }
}
