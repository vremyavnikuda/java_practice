package oop_basic.offer_task;
//цена коробки
class MoneyBox extends HeavyBox {
    int cost;

    //Конструирование клона объекта
    MoneyBox (MoneyBox ob){//передача объекта конструктору
        super(ob);
        cost=ob.cost;
    }

    //конструктор используемый при указании всех параметров
    MoneyBox(int w,int h,int d,int m,int c ){
        super(w,h,d,m);//вызов конструктора суперкласса
        cost=c;
    }

    //конструктор по умолчанию
    MoneyBox(){
        super();
        cost=-1;
    }

    //конструктор для создания куба
    MoneyBox (int len,int m,int c){
        super(len,m);
        cost=c;
    }
}
