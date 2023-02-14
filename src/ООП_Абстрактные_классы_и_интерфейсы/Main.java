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
        HighRiseBuilding highRiseBuilding = new HighRiseBuilding(
                "Здание 1",
                "Адрес 1",
                2021,
                "Архитектор 1",
                false,
                true,
                15,
                "Жилой комплекс 1"
        );
        highRiseBuilding.setElevator(false);
        highRiseBuilding.displayInfo();
    }
}
