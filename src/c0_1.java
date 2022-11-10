import java.util.Scanner;

public class c0_1
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int q = sc.nextInt();
            int w = sc.nextInt();
            System.out.println(q * w);
        }
    }
}

