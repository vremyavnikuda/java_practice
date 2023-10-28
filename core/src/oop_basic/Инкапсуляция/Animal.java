package oop_basic.Инкапсуляция;
/*
Хотел бы получить комментарии по поводу кода ,заранее спасибо

Добавьте инкапсуляцию в класс Animal.
Для каждого свойства в классе Animal должны быть свои методы get/set
(для булевых значений не get, a is).
*/
public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwimm;

    public Animal(String type, String name, int age, double weight, boolean isWalk, boolean isFly, boolean isSwimm) {
        this.type=type;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.isWalk=isWalk;
        this.isFly=isFly;
        this.isSwimm=isSwimm;
    }

    public Animal(String type, String name) {
        this.type=type;
        this.name=name;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public boolean isFly(){
        return isFly;
    }
    public boolean isWalk(){
        return isWalk;
    }
    public boolean isSwimm(){
        return isSwimm;
    }

    public void setType(String type){
        this.type=type;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setFly(boolean Fly){
        this.isFly=Fly;
    }
    public void setWalk(boolean Walk){
        this.isWalk=Walk;
    }
    public void setSwimm(boolean Swimm){
        this.isSwimm=Swimm;
    }




    //методы класса
    public void display(){
        System.out.println(type+"\n"+name + "\n"+age+"\n"+weight+"\n"+isFly+"\n"+isWalk+"\n"+isSwimm);
    }
    public void rename(String rename){
        name=rename;
    }
    public void holiday(int day){
        weight+=day*0.1;
    }
}
