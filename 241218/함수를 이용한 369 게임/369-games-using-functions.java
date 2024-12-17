import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(countNum(a,b));
    }

    public static int countNum(int a, int b){
        int num = 0;
        for(int i=a; i<=b; i++){
            if(hasOneOfThem(i)){
                num++;
            } 
            else if(isMultipleOfThree(i)){
                num++;
            } 
            else continue;
        }
        return num;
    }

    public static boolean hasOneOfThem(int n){ 
        for(int i=0; i<6; i++){
            if(n == 0) break;
            if(n%10 == 3 | n%10 == 6 | n%10 == 9) return true;
            n /= 10; 
        }
        return false;
    }

    public static boolean isMultipleOfThree(int sum){
        return (sum%3) == 0;
    }
}