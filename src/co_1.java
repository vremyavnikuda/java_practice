
import java.util.Scanner;

public class co_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int w = sc.nextInt();
        if (q > w) {
            System.out.println(q);
        } else {
            System.out.println(w);
        }
    }
}