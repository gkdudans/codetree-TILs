import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        System.out.print(printMin(a,b,c));
    }
    public static int printMin(int a, int b, int c){
        int tmp = (a < b) ? a : b;
        tmp= (tmp < c) ? tmp : c;
        return tmp; 
    }
}