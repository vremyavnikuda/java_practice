/* Задача из публичного доступа */
public class co_2 {
    public static void main(String[] args) {
        int first = 15;
        int second = --first;
        second *= 2;
        int third = second - 13;
        if (first == third) {
            System.out.println(--second);
        } else {
            System.out.println(third - first + second);
        }
    }
}
