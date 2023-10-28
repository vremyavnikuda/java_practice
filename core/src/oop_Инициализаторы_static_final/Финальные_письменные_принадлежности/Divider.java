package oop_Инициализаторы_static_final.Финальные_письменные_принадлежности;

public class Divider extends WritingMaterials {
    private String dividetType;
    private boolean metal;

    static String description="Это класс Divider ,он наследуется от класса WritingMaterials\n"+
            "Он содержит в себе приватные поля String(dividetType)+boolean(metal)\n"+
            "Метод draw_circle который отображает дает задание нарисовать круг объекту\n"+
            "Метод display() покажет к какой классу относится объект\n"+
            "Содержит в себе get/set методы";

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

    public String isMetal() {
        if (metal!=false){
            return "Состоит из метала";
        }else {
            return "Не состоит из метала";
        }
    }

    //переопределение метода display()
    public void display() {
        System.out.println("This is " + Divider.class.getSimpleName());
    }
    public static String printDescription(){
        System.out.println(description);
        return description;
    }
}
