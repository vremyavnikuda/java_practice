package oop_basic.Наследники_письменных_принадлежностей;

public class Ruler extends WritingMaterials{
    private double length;
    private boolean wood;

    public Ruler() {
        super();
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
}
