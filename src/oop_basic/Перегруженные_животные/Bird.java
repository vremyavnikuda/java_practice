package oop_basic.Перегруженные_животные;

public class Bird extends Animal{
    //зона обитания
    private String area;
    //улетает ли она зимовать
    private boolean winterFly;
    public Bird() {
        super();
    }

    /*
    У птиц должны быть новые свойства:
    - area - зона обитания
    - winterFly - ответ на вопрос, улетает ли она зимовать
    */

    //Улетает ли она зимовать?

    public String isWinterFly() {
        if (winterFly==true){
            return "Улетает ли она зимовать: Да";
        }else {
            return "Улетает ли она зимовать: Да";
        }
    }
    public boolean setWinterFly(boolean winterFly) {
        this.winterFly=winterFly;
        return winterFly;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area=area;
    }

    //метод  chirik_chirik, который выводит на экран строку "Chirik-Chirik".
    public void chirick_chirick(){
        System.out.println("Chirik-Chirik");
        System.out.println("--------------------------------");
    }
}
