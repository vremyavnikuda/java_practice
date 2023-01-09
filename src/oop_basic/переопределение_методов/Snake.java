package oop_basic.переопределение_методов;

public class Snake extends Animal {
    @Override
    public void voice() {
        System.out.println("Ш-ш-ш!");
    }
}