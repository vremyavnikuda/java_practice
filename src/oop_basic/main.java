package oop_basic;

public class main {
    public static void main(String[] args){
        MyClass t1=new MyClass();
        MyClass t2=new MyClass();
        System.out.println(t1.num+" "+t2.num);
    }

}
class MyClass{
    int num;
    MyClass(){
        num=100;
    }
}
