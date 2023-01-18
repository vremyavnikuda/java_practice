package oop_Инициализаторы_static_final.Инициализатор;

public class Insect extends Animal {
    //количество крыльев
    int  wingCount;
    //умеет ли ходить по воде
    boolean likeJesus;
    public Insect() {
        super();
    }

    //инициализатор
    static {
        String name="Unknown";
        String type="Unknown";
    }

    /*У насекомых должны быть новые свойства:
    wingCount - количество крыльев
    likeJesus - умеет ли ходить по воде
    */

    public int setWingCount(int wingCount) {
        this.wingCount=wingCount;
        return wingCount;
    }
    public int getWingCount() {
        return wingCount;
    }

    //Умеет ли ходить по воде?
    public String isLikeJesus() {
        if (likeJesus){
            return "Умеет ли ходить по воде?: Да";
        }else {
            return "Умеет ли ходить по воде?: Нет";
        }
    }
    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus=likeJesus;
    }

    //метод ggggg, который выводит на экран строку "Ggggg".
    public void ggggg(){

        System.out.println("Ggggg");
        System.out.println("--------------------------------");
    }
    @Override
    public  void display(){
        System.out.println("I am "+getClass());
    }
}
