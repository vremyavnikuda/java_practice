package oop_Инициализаторы_static_final.Письменные_принадлежности_по_умолчанию;

public class Ruler extends WritingMaterials {
    private double length;
    private boolean wood;

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
}
