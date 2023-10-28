package oop_Инициализаторы_static_final.Финальные_письменные_принадлежности;

final class Ruler extends WritingMaterials {
    private double length;
    private boolean wood;
    static String description="Это класс Ruler ,наследоваться от этого класса запрещено\n"+
            "Этот класс содержит приватные поля (double length) и (boolean wood)\n"+
            "Так же он наследуется от класса WritingMaterials\n"+
            "У него есть get/set методы\n"+
            "Есть метод display() который показывает к какому классу относится объект\n"
            ;

    public Ruler() {
        super();
    }

    //метод measure
    public void measure(){
        System.out.println("Сейчас измерим длину");
    }

    //Length
    public void setLength(double length){
        this.length=length;
    }


    public double getLength() {
        return length;
    }

    //wood
    public void setWood(boolean wood){
        this.wood=wood;
    }

    public boolean isWood(){
        return wood;
    }

    //переопределение метода display()
    public void display(){
        System.out.println("This is "+ Ruler.class.getSimpleName());
    }

    /* Метод printDescription() отображает информацию о классе и его методах,
        а так же информацию как с ними взаимодействовать */
    public static String printDescription(){
        System.out.println(description);
        return description;
    }
}
