package oop_Инициализаторы_static_final.Статичные_письменные_принадлежности;

public class Pen extends WritingMaterials {
    private int countColor;
    private boolean auto;

    public Pen(String name,String color) {
        super(name,color);
    }


    //метод writeMyName, который выводит на экран строчку, содержащую имя
    public void writeMyName(){
        System.out.println("vremyavnikuda");
    }

    //countColor
    public void setCountColor(int countColor) {
        this.countColor=countColor;
    }

    public int getCountColor() {
        return countColor;
    }

    //auto
    public void setAuto(boolean auto) {
        this.auto=auto;
    }

    public boolean isAuto() {
        return auto;
    }

    //переопределение метода display()
    public void display(){
        System.out.println("This is "+Pen.class.getSimpleName());
    }
}
