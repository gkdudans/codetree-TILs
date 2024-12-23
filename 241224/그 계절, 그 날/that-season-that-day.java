import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        isMatching(Y, M, D);
    }
    public static void isMatching(int Y, int M, int D){
        if(isLeap(Y) && M==2){
            if(1<=D && D<30) printResult(M);
        }
        else{
            if(M==1 | M==3 | M==5 | M==7 | M==8 | M==10 | M==12) 
                if(1<=D && D<32) printResult(M);
            else if(M==2)
                if(1<=D && D<29) printResult(M);
            else if(M==4 | M==6 | M==9)
                if(1<=D && D<31) printResult(M);
            else System.out.print("-1"); 
        }
    }
    public static boolean isLeap(int Y){
        if(Y%4==0 && Y%100!=0) return true;
        else if(Y%100==0 && Y%400==0) return true;
        else return false;
    }
    public static void printResult(int M){
        if(3<=M && M<6) System.out.print("Spring");
        else if(6<=M && M<9) System.out.print("Summer");
        else if(10<=M && M<12) System.out.print("Fall");
        else System.out.print("Winter");
    }
}