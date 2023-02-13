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
    }
}
