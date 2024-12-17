import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.print(isLeap(y));
    }
    public static boolean isLeap(int y){
        if(y%4 == 0 && y%100 != 0) return true;
        if(y%100 == 0 && y%400 != 0 ) return false;
        if(y%100 == 0) return true;
        return false;
    }
}