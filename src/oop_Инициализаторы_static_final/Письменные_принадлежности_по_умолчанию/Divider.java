package oop_Инициализаторы_static_final.Письменные_принадлежности_по_умолчанию;

public class Divider extends WritingMaterials {
    private String dividetType;
    private boolean metal;

    public Divider() {
        super();
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
        System.out.println("This is "+Divider.class.getSimpleName());
    }
}
