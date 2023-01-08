package oop_basic.offer_task;

import javax.swing.text.View;

public class onClick {
    public void onClick(View v){
        MoneyBox moneybox1 = new MoneyBox(100, 200, 150, 100, 300);
        MoneyBox moneybox2 = new MoneyBox(20, 30, 40, 7, 10);

        int vol;
        vol = moneybox1.getVolume();
        Log.i("Java-курс", "Объем первой коробки равен " + vol);
        Log.i("Java-курс", "Вес первой коробки равен " + moneybox1.weight);
        Log.i("Java-курс", "Цена коробки: " + moneybox1.cost);

        vol = moneybox2.getVolume();
        Log.i("Java-курс", "Объем второй коробки равен " + vol);
        Log.i("Java-курс", "Вес второй коробки равен " + moneybox2.weight);
        Log.i("Java-курс", "Цена коробки: " + moneybox2.cost);
    }
}
