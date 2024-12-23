import java.util.Scanner;

class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntWrapper suba = new IntWrapper(a);
        IntWrapper subb = new IntWrapper(b);
        oper(suba, subb);
        a = suba.value;
        b = subb.value;
        System.out.print(a + " " + b);
    }
    public static void oper(IntWrapper a, IntWrapper b){
        if(a.value > b.value){
            a.value += 25;
            b.value *= 2;
        }
        else{
            a.value *= 2;
            b.value += 25;
        }
    }
}