package oop_Инициализаторы_static_final;

public class AnonymousExample {

    //внутренний класс AnonymousSquare
    static class AnonymousSquare{
        private static final int []square=new int[10];
        //блок инициализатора
        {
            for (int i=0;i<square.length;i++){
                square[i]=i*i;
            }
        }

        //объявление переменных без указания значение
        String userName;
        int i;

        //метод display()
        //выводим полученный результат на консоль
        void dispaly(){
            System.out.println("Hi " + userName + ", " + i
                    + " squared is " + square[i] + '.');
        }
    }
    //метод создания внутреннего класса с инициализатором переменных
    //userName и i
    static AnonymousSquare createAnonSquare(){
        return new AnonymousSquare(){
            {
                userName="Ed";
                i=3;
            }
        };
    }

    //вызываем метод display()
    public static void main (String[]args){
        createAnonSquare().dispaly();
    }
}
