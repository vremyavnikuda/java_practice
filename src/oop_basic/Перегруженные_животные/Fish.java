package oop_basic.Перегруженные_животные;

public class Fish extends Animal{
    //тип чешуи
    String squama;
    //умеет ли плавать против течения
    boolean upStreamSwim;
    public Fish() {
        super();
    }

    /*
    У рыб должны быть новые свойства:
    squama - тип чешуи
    upStreamSwim - умеет ли плавать против течения
    */

    public void setSquama(String squama) {
        this.squama=squama;
    }
    public String getSquama() {
        return squama;
    }
    public String isUpStreamSwim() {
        if (upStreamSwim==true){
            return "Умеет ли плавать против течения?: Да";
        }else {
            return "Умеет ли плавать против течения?: Нет";
        }
    }
    public boolean setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim=upStreamSwim;
        return upStreamSwim;
    }

    //метод bul_bul, который выводит на экран строку "Bul-bul".
    public void bul_bul(){
        System.out.println("Bul-bul");
        System.out.println("--------------------------------");
    }
}
