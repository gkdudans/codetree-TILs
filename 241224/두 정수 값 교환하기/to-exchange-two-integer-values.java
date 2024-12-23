import java.util.Scanner;

// IntWrapper라는 객체를 만들어 넘김 
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        IntWrapper subn = new IntWrapper(n);
        IntWrapper subm = new IntWrapper(m);
        swap(subn, subm);
        n = subn.value;
        m = subm.value;
        System.out.print(n + " " + m);
    }
    public static void swap(IntWrapper a, IntWrapper b){
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }

}