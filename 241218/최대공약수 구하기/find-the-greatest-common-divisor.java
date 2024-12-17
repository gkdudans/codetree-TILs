import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printGcd(n, m);
    }
    public static void printGcd(int n, int m){
        int k = (n > m) ? n : m;
        int gcd=0;
        for(int i=1; i<k; i++){
            if(n%i==0 && m%i==0) gcd=i;
            else continue;
        }
        System.out.print(gcd);
    }
}




