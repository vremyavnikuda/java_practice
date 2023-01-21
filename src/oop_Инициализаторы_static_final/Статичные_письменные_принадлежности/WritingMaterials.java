package oop_Инициализаторы_static_final.Статичные_письменные_принадлежности;

public  class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    //Статический метод и статическое свойство с описанием класса
    //которое может быть вызвано у класса, но нельзя вызвать у объекта
    static String description="Это класс WritingMaterials ,он хранит в себе приватные строки ,у него есть метод \ndisplay() " +
            "метод увеличения/снижения цены,метод замены на новый цвет стержня,метод \nпри помощи которого можно узнать" +
            "умеет ли рисовать предмет,так же содержит геттеры и сеттеры  \n";

    //инициализатор color и name
    {
        name= getClass().getSimpleName();
        color=getColor();
    }
    public  WritingMaterials(){
        //конструктор с дефолтными параметрами
    }
    public  WritingMaterials(String name,String color){
        /*this.name=name;
        this.color=color;
        this.price=price;
        this.length=length;
        this.draw=draw;*/
    }

    //String name
    public String getName(){
        if (name!=null && !name.isEmpty()){
            return name;
        }else {
            return "default";
        }
    }
    public void setName(){
        this.name=name;
    }

    //String color
    //обрабатываем исключение если (есть) и если (нет) аргументов у getColor()
    public String getColor(){
        if (color!=null && !color.isEmpty()){
            return color;
        }else {
            return "default";
        }
    }

    //метод setColor(если есть аргументы)
    public void setColor(){
        this.color=color;
    }
    //метод setColor(если нет аргументов)
    public String setColor(String color) {
        this.color=color;
        return color;
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

    /* Метод printDescription() отображает информацию о классе и его методах,
    а так же информацию как с ними взаимодействовать */
    public static void printDescription(){
        System.out.println(description);
    }
}
