package oop_basic.offer_task;

public class Box {
    private int width;//ширина коробки
    private int height;//высота коробки
    private int depth;//глубина коробки

    //Конструктор для создания клонов объекта
    Box(Box ob){//передача объекта конструктору
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

    //Конструктор, используемый при указании все изменений
    Box (int w,int h,int d){
        width=w;
        height=h;
        depth=d;
    }

    //Конструктор , используемый когда ни одно их изменений не указано
    Box(){
        //значение -1 используется
        //для указания неинициализированного параллелепипеда
        width=-1;
        height=-1;
        depth=-1;
    }

    //Конструктор для создания куда
    Box(int len){
        width=height=depth=len;
    }

    //вычисляем объем коробки
    int getVolume(){
        return width*height*depth;
    }
}
