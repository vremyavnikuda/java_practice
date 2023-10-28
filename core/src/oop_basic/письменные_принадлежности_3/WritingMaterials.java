package oop_basic.письменные_принадлежности_3;

public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    public WritingMaterials(){
        this.name=name;
        this.color=color;
        this.price=price;
        this.length=length;
        this.draw=draw;
    }

    //конструктор
    public WritingMaterials(String name,String color){
        this.name=name;
        this.color=color;
    }
    public WritingMaterials(String name, int price){
        this.name=name;
        this.price=price;
        this.color="No Color";
    }
    public WritingMaterials(int price,double length,boolean draw){
        this.price=price;
        this.length=length;
        this.draw=draw;
        this.color="No Color";
        this.name="No Name";
    }
    public WritingMaterials(String name,String color,int price,double length,boolean draw){
        this.name=name;
        this.color=color;
        this.price=price;
        this.length=length;
        this.draw=draw;
    }
    //String name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //String color
    public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    //int price
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    //double length
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    //boolean draw
    public boolean isDraw(){
        return draw;
    }
    public void setDraw(boolean draw){
        this.draw=draw;
    }

    //метод display
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
