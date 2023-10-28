package oop_Инициализаторы_static_final.Пронумерованные_письменные_принадлежности;

public class Main {
    public static void main(String[] args) {

        WritingMaterials pen = new WritingMaterials();
        pen.setName();
        pen.setColor();
        System.out.println(pen.getColor());
        System.out.println(pen.getName());
        pen.setColor("Red");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());

        //обращаемся к методу toString()
        System.out.println(pen.toString());

        //вызываем описание класса WritingMaterials
        WritingMaterials.printDescription();
        //у объектов класса метод не вызывается !!!!
    }
}
