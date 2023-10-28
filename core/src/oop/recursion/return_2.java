package oop.recursion;

import java.util.Scanner;

public class return_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F +"H");
    }
    public static int arhimed(int ro, int V){
        int g = 10;
        int F = ro * g * V;
        return F;
    }
}
