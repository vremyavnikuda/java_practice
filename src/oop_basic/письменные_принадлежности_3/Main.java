package oop_basic.письменные_принадлежности_3;

public class Main {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
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

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.setDraw(true);
        wm2.display();
        wm2.draw();
    }
}
/*Остановился на редактирование класса main
* а именно добавление остальных объектов класса
* возможно придется добавить конструкторы в класс WritingMaterials
* и переопределить несколько методом
* хотя по заданию нужно:
    {добавить классу WritingMaterials инициализатор
    задать в нём для каждого предмета название и цвет по умолчанию
    добавить инициализаторы и в наследников вашего класса. }
Так же обрати внимание на аргументы объектов ,они почему-то выдают исключение, поработай с этим
    */