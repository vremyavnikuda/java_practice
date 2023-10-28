package oop_basic;

public class main {
    public static void main(String[] args){
        //изменяем параметры 1 объекта
        MyClass t1=new MyClass(10);
        //измеряем параметры второго объекта
        MyClass t2=new MyClass(20);
        //выводи результат в консоль
        System.out.println(t1.num+" "+t2.num);
    }

}
class MyClass{
    int num;
    MyClass(int i){

        num=i;
    }
}
