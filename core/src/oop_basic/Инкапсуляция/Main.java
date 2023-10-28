package oop_basic.Инкапсуляция;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.setSwimm(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwimm());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());
    }
}
