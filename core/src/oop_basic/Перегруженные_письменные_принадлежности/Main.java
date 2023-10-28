package oop_basic.Перегруженные_письменные_принадлежности;

public class Main {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);
        //pen.display();

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.setDraw(false);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);
        //ruler.draw();
    }
}
