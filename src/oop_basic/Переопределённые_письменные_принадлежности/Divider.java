package oop_basic.Переопределённые_письменные_принадлежности;

public class Divider extends WritingMaterials {
    private String dividetType;
    private boolean metal;

    public Divider() {
        super("ручка", "Красный", 145, 15.6, true);
    }
    //метод draw_circle
    public void draw_circle(){
        System.out.println("Нарисован круг");
    }

    //DividerType
    public void setDividerType(String dividerType) {
        this.dividetType=dividerType;
    }

    public String getDividerType() {
        return dividetType;
    }

    //Metal
    public void setMetal(boolean metal) {
        this.metal=metal;
    }

    public boolean isMetal() {
        return metal;
    }

    //переопределение метода display()
    public void display(){
        System.out.println("This is "+getClass());
    }
}
