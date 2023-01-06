package oop_basic.Main;

//определяем класс
public class Animal {

    // определяем объекты класса
    String type;
    String name;
    int  age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    //Конструктор

    public Animal (/*String type,String name,int age,double weight,boolean isFly,
                   boolean isWalk,boolean isSwim*/){
        this.type=type;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.isFly=isFly;
        this.isWalk=isWalk;
        this.isSwim=isSwim;
    }

    //Методы класса
    public void display(){
        System.out.println(type+"\n"+name + "\n"+age+"\n"+weight+"\n"+isFly+"\n"+isWalk+"\n"+isSwim);
    }
    public void rename(String Rename){
        name=Rename;
        System.out.println(name);
    }
    public void holiday(int days){
        System.out.println(weight+=days*0.1);
    }
}
