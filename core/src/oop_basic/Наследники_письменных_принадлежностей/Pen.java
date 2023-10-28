package oop_basic.Наследники_письменных_принадлежностей;
public class Pen extends WritingMaterials {
    private int countColor;
    private boolean auto;

    public Pen() {
        super();
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
}
