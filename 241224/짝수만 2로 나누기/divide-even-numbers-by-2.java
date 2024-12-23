import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printResult(arr.clone());
    }
    public static void printResult(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) System.out.print(arr[i]/2+" ");
            else System.out.print(arr[i]+" ");
        }
    }
}