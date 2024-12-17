import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printLcm(n, m);
    }
    public static void printLcm(int n, int m){
        int k = (n > m) ? n : m;
        int tmp=k;
        for(int i=k; i<=n*m; i++){
            if(i%n==0 && i%m==0){
                tmp = i;
                break;
            }
        }
        System.out.print(tmp);
    }
}