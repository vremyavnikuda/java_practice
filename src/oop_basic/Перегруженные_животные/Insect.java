package oop_basic.Перегруженные_животные;

public class Insect extends Animal{
    //количество крыльев
    int  wingCount;
    //умеет ли ходить по воде
    boolean likeJesus;
    public Insect() {
        super();
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
        if (likeJesus==true){
            return "Умеет ли ходить по воде?: Да";
        }else {
            return "Умеет ли ходить по воде?: Нет";
        }
    }
    public boolean setLikeJesus(boolean likeJesus) {
        this.likeJesus=likeJesus;
        return likeJesus;
    }

    //метод ggggg, который выводит на экран строку "Ggggg".
    public void ggggg(){

        System.out.println("Ggggg");
        System.out.println("--------------------------------");
    }
}
