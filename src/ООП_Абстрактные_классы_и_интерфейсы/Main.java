package ООП_Абстрактные_классы_и_интерфейсы;

import ООП_Абстрактные_классы_и_интерфейсы.Library.Library;
import ООП_Абстрактные_классы_и_интерфейсы.Police.PoliceDepartment;
import ООП_Абстрактные_классы_и_интерфейсы.ShoppingCenter.ShoppingCenter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

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
        myLibrary.displayMethod();
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
        //показать методы доступные данному объекту
        shanghaiTower.displayMethod();
        System.out.println("---------------");

        PoliceDepartment NYDP = new PoliceDepartment(
                "Police department of New York City",
                "New York, USA",
                1875,
                "James Renwick Jr.",
                false,
                250,
                100,
                20,
                150
        );
        NYDP.displayInfo();
        NYDP.displayMethod();
        ShoppingCenter shoppingCenter = new ShoppingCenter(
                "ТРЦ Афимолл",
                "Пресненская набережная, 2",
                2008,
                "David Adjaye",
                false
        );

        // Устанавливаем значения свойств объекта
        shoppingCenter.setNumStores(200);
        shoppingCenter.setFloorNumber(4);
        shoppingCenter.setParkingShoppingCenter(true);
        shoppingCenter.setSecurityShoppingCenter(true);

        // Выводим информацию о здании
        shoppingCenter.displayInfo();
        shoppingCenter.displayMethod();
    }
}
