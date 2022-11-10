/*Температура
Вводится одно действительное число - температура воздуха на улице. Если она меньше, чем 22.4 градуса, то вывести "Холодно(", если больше, то вывести "Тепло!", если ровно 22.4 градуса, то вывести "Прохладно...".

Sample Input 1:

19.3
Sample Output 1:

Холодно(
Sample Input 2:

33.1
Sample Output 2:

Тепло!*/


import java.util.Scanner;

public class co_12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double q = sc.nextDouble();
        if (q<22.4){
            System.out.println("Холодно(");
        } else if (q>22.4) {
            System.out.println("Тепло!");
        }
        else if(q==22.4) System.out.println("Прохладно...");
    }
}
