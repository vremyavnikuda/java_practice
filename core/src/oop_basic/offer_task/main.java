package oop_basic.offer_task;

public class main {
    public static void main (String[]args){
        MoneyBox moneybox1=new MoneyBox(100, 200, 150, 100, 300);
        MoneyBox moneybox2=new MoneyBox(20,30,40,7,10);

        int vol;

        vol = moneybox1.getVolume();
        System.out.println("Объем первой коробки равен " + vol);
        System.out.println("Вес первой коробки равен " + moneybox1.weight);
        System.out.println("Цена коробки: " + moneybox1.cost);

        vol = moneybox2.getVolume();
        System.out.println("Объем второй коробки равен " + vol);
        System.out.println("Вес второй коробки равен " + moneybox2.weight);
        System.out.println("Цена коробки: " + moneybox2.cost);
    }
}
