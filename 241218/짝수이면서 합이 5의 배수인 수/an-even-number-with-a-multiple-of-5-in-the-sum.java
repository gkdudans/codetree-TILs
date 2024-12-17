import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isMultipleOfFive(n)) System.out.print("Yes");
        else System.out.print("No");
    }
    public static boolean isMultipleOfFive(int n){
        int a = n/10;
        int b = n%10;
        if((a+b)%5==0 && n%2==0) return true;
        else return false;
    }
}