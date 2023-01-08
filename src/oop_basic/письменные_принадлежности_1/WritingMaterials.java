package oop_basic.письменные_принадлежности_1;
/*
Письменные принадлежности 1

Опишите класс WritingMaterials. У класса WritingMaterials должны быть свойства:
    name - название предмета (String)
    color - цвет, которым он пишет (String).
    price - его цена (int)
    length - его длина (double)
    draw - ответ на вопрос, умеет ли эта письменная принадлежность писать? (boolean)

У предмета должны быть методы:
    display()  - выводит информацию о предмете в формате:
        "Название: <его название>, Цвет: <цвет>, Длина: <его длина>, Цена: <его цена>, Умеет рисовать: <Да/Нет>.
    replace_rod(String) - принимает новый цвет стержня
    priceUp(int) - принимает на вход изменение цены. Увеличивает цену на это число.
    priceDown(int) - принимает на вход изменение цены. Уменьшает цену на это число.
    draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линию. Её цвет - <цвет>.",
        в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.".*/
public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

    //конструктор
    public WritingMaterials(){
        this.name=name;
        this.color=color;
        this.price=price;
        this.length=length;
        this.draw=draw;
    }
    //метод display с исключением(drow==true,drow==false)
    public void display(){
        StringBuilder sb=new StringBuilder();
        //условие работы метода display
        if (name!=null){
            sb.append("Название: ").append(name).append(",");
        }else {
            sb.append("Название: не указано").append(",");
        }
        if (color!=null){
            sb.append("Цвет: ").append(color).append(",");
        }else {
            sb.append("Цвет: не указан").append(",");
        }

        if (length!=0){
            sb.append("Длина: ").append(length).append(",");
        }else {
            sb.append("Длина: не указана").append(",");
        }
        if (price!=0){
            sb.append("Цена: ").append(price).append(",");
        }else {
            sb.append("Цена: не указана").append(",");
        }
        if (draw==true){
            sb.append("Умеет рисовать: Да");
        }else if(draw==false) {
            sb.append("Умеет рисовать: Нет");
        }else {
            sb.append("Умеет рисовать: Параметр не задан\n");
        }
        System.out.println(sb.toString());
    }
    //метод увеличения цены
    public void priceUp(int priceUp){
        price+=priceUp;
    }
    //метод снижения цены
    public void priceDown(int priceDown){
        price-=priceDown;
    }
    //метод замены на новый цвет стержня
    public void replace_rod (String newColor){
        color=newColor;
    }
    //метод (узнаем уметь ли предмет рисовать)
    public void draw(){
        //исключения
        if (draw){
            System.out.println(name+" провёл линию. Её цвет - "+color+".");
        }else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
}
