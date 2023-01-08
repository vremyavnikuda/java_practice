package oop_basic.письменные_принадлежности_2;

public class Main {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.draw = true;
        wm2.display();
        wm2.draw();
    }
}
