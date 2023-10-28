package oop_basic.переопределение_методов;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав!");
    }
}