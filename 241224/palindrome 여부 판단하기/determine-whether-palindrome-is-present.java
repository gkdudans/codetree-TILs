import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        isPalindrome(str);
    }
    public static void isPalindrome(String str){
       for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}