package ООП_Абстрактные_классы_и_интерфейсы.Library;
import ООП_Абстрактные_классы_и_интерфейсы.Building;
import java.time.LocalTime;
/*
    Реализовать метод отображения класса
    данный метод должен описывать все доступные методы в классе
    -> как они работают и как с ними взаимодействовать
    Выводить информацию у подклассов супер класса
    -> отображать информацию о методах подклассов и как с ними взаимодействовать
*/

//Library
public class Library extends Building {

    //int numBooks-> кол-во книг в Library
    private int numBooks;

    //String librarian -> наличие библиотекаря
    private String librarian;

    //String hoursOfOperation -> часы работы библиотеки
    private String hoursOfOperation;

    public Library(
            String titleBuildeing,
            String addressBuildeing,
            int year_of_constructionBuildeing,
            String name_architectBuildeing,
            boolean cultural_monumentBuildeing,

            int numBooks,
            String librarian,
            String hoursOfOperation
    ) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing
        );

        this.numBooks = numBooks;
        this.librarian = librarian;
        this.hoursOfOperation = hoursOfOperation;
    }
    //Getter/Setter

    //get/set numBooks-> кол-во книг в Library
    public int getNumBooks() {
        //кол-во книг берем из размера HashMap bookOfLibrary.size()
        //и возвращаем из в return
        return BookByAuthorOfLibrary.bookOfLibrary.size();
    }
    public void setNumBooks(int numBooks) {
        this.numBooks = numBooks;
    }

    //get/set String librarian -> наличие библиотекаря
    public String getLibrarian(){
        return librarian;
    }
    public void setLibrarian(String librarian){
        this.librarian=librarian;
    }

    //get/set hoursOfOperation -> часы работы библиотеки
    public String getHoursOfOperation(){
        return hoursOfOperation;
    }
    public void  setHoursOfOperation(String hoursOfOperation){
        this.hoursOfOperation=hoursOfOperation;
    }

    //Метод

    //МЕТОДЫ
    //метод displayInfo() -> отображает информацию о классе Library -> переопределение метода класса Building displayInfo()
    @Override
    public Runnable displayInfo(){
        System.out.println("Здание: " + getTitleBuildeing());
        System.out.println("\t" +"Адрес: " + getAddressBuildeing());
        System.out.println("\t" +"Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("\t" +"Имя архитектора: " + getName_architectBuildeing());
        System.out.println("\t" +"Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("\t" +"Часы работы библиотеки: "+getHoursOfOperation());
        System.out.println("\t" +"Библиотека в данный момент : "+openLibrary());
        System.out.println("\t" +"Обновление списка литературы в библиотеке: \n"+ BookByAuthorOfLibrary.addBookOfLibrary());
        System.out.println("\t" +"Количество книг в библиотеке: "+getNumBooks());
        return null;
    }
    //методом String displayBookOfLibrary() вытягиваем из класса BookByAuthorOfLibrary список книг которые есть у нас в библиотеке
    public static String displayBookOfLibrary(){
        return BookByAuthorOfLibrary.displayBookOfLibrary();
    }

    //МЕТОДЫ
    //Метод проверки открыта ли библиотека
    public String openLibrary(){
        //получаем корректное текущее время
        LocalTime currentTime=LocalTime.now();

        //парсим из библы время открытия и закрытия
        LocalTime openingTime =LocalTime.parse(hoursOfOperation.split("-")[0]);
        LocalTime closingTime =LocalTime.parse(hoursOfOperation.split("-")[1]);
        //Сравниваем текущее время с часами открытия и закрытия библиотеки
        if (currentTime.isAfter(openingTime)&& currentTime.isBefore(closingTime)){
            return "Открыта";
        }else {
            return "Закрыта";
        }
    }
    //метод displayMethod() -> Доступные методы для объектов созданных данным классом
    @Override
    public void displayMethod() {
        System.out.println("---------------");
        System.out.println("Имя класса: HighRiseBuilding");
        System.out.println("Данный класс является подклассом: Building");
        System.out.println("Доступные методы: для объектов данного класса " + "\n" + "\t" + "метод locatedBuilding() -> В каком районе находится здание?" + "\n" + "\t" + "метод tallBuilding() -> Это здание является высотным ?" + "\n" + "\t" + "метод displayInfo() -> отображение информации о классе HighRiseBuilding -> переопределение метода" + "\n" + "\t" + "метод displayMethod() -> -> Доступные методы для объектов созданных данным классом");
    }
}


