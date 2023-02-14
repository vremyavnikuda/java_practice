package ООП_Абстрактные_классы_и_интерфейсы;

import ООП_Абстрактные_классы_и_интерфейсы.Library.Library;

public class Main {
    public static void main(String []args){

        Library myLibrary = new Library(
                "Центральная городская библиотека им. Пушкина",
                "ул. Ленина, 10",
                1965,
                "Иван Иванович Иванов",
                true,
                100000,
                "Анна Ивановна",
                "10:00-18:00"
        );
        myLibrary.displayInfo();
        System.out.println("---------------");

        HighRiseBuilding shanghaiTower = new HighRiseBuilding(
                "Shanghai Tower",
                "501 Yincheng Middle Rd, Lujiazui, Pudong, Shanghai, Китай",
                2015,
                "Gensler",
                false,
                true,
                128,
                "Lujiazui CBD"
        );
        shanghaiTower.setElevator(false);
        shanghaiTower.displayInfo();
    }
}
