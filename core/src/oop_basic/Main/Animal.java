package oop_basic.Main;
/*
Животные 2
Дополните класс Animal. У класса Animal должны быть следующие конструкторы:

Позволяющий создать животное с его типом и именем
Позволяющий создать животное с его типом и возрастом. При этом в имени окажется значение "No Name"
Позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде.
*/

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
    //конструктор
    //создать животное с его типом и именем
    public Animal(String name,String type){
        this.type=type;
        this.name=name;
        //System.out.println("--------------------");
    }
    //Конструктор
    //Создать животное с его типом и возрастом.
    // При этом в имени окажется значение "No Name"
    public Animal(String type,int age){
        this.type=type;
        this.age=age;
        this.name="No Name";
        //System.out.println("--------------------");
    }

    //Конструктор
    //Позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде.

    public Animal (String type,String name,int age,double weight,boolean isFly,boolean isWalk,boolean isSwim){
        this.type=type;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.isFly=isFly;
        this.isWalk=isWalk;
        this.isSwim=isSwim;
        //System.out.println("--------------------");
    }

    //Методы класса
    public void display(){
        System.out.println(type+"\n"+name + "\n"+age+"\n"+weight+"\n"+isFly+"\n"+isWalk+"\n"+isSwim);
    }
    public void rename(String Rename){
        name=Rename;
        return;
    }
    public void holiday(int days){
        weight+=days*0.1;
        return;
    }
}
