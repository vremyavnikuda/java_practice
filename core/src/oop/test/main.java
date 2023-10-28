package oop.test;

class Programm {

    public static void main(String[] args) {
        int[] mas = {1,2,3,4};
        f(mas);
        System.out.println(mas[0]);
    }

    static void f(int[] a){
        a[0] = 10;
    }
}
