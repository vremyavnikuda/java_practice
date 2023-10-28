package oop_basic.переопределение_методов;

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Мау!");
    }
}