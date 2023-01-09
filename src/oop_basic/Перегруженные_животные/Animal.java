package oop_basic.Перегруженные_животные;

public class Animal {
    // определяем объекты класса
    String type;
    String name;
    int  age;
    double weight;
    private int day;
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
        //System.out.println("-------------------------------------------------------------------------");
    }
    public void rename(String Rename){
        name=Rename;
    }
    public void holiday() {
        weight += 0.1;
    }
    public int holiday(int  n) {
        for (int i = 0; i < n; i++) {
            weight += 0.1;
        }
        return (int) weight;
    }

    public double holiday(double m) {
        weight += m;
        return weight;
    }

    public double holiday(double m, int n) {
        for (int i = 0; i < n; i++) {
            weight += m;
        }
        return weight;
    }
}
