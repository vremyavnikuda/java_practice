/*
Генератор
Даны два натуральных числа N и K. Требуется вывести  все цепочки x1, x2, ..., xN такие, что xi -
натуральное и 1 ≤ xi ≤ K.

Входные данные
Вводятся два натуральных числа N и K (N, K ≤ 6).

Выходные данные
Выведите все требуемые цепочки в произвольном порядке – по одной на строке. Никакая цепочка не должна
встречаться более одного раза.

Sample Input:
2 3

Sample Output:
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
*/
package oop.Решение_задач_с_использованием_функций;

import java.util.*;

public class task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        generator(n,k);
    }

    static void generator (int n,int k) {
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int x = 0;
        String s = "",s1 = "";
        boolean is_flag = false;
        for(int i=(int)Math.pow(10,(n-1));i<((int) Math.pow(10,n)-1);i++) {
            s = String.valueOf(i);
            for (int j=0;j<s.length();j++) {
                String[]arr = s.split("");
                x = Integer.parseInt(arr[j]);
                if (!(x>=1&&x<=k)) {
                    is_flag = false;
                    break;
                } else
                    is_flag = true;
            }
            if (is_flag) {
                s1 = s.replace(""," ").trim();
                set.add(s1);
            }
        }
        list.addAll(set);
        Collections.sort(list);

        for (String r:list)
            System.out.println(r);
    }
}


