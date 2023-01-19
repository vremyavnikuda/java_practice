package oop_basic.Переопределённые_письменные_принадлежности;

public class Ruler extends WritingMaterials {
    private double length;
    private boolean wood;

    public Ruler() {
        super("ручка", "Красный", 145, 15.6, true);
    }

    //метод measure
    public void measure(){
        System.out.println("Сейчас померяем длину");
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
