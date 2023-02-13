package ООП_Абстрактные_классы_и_интерфейсы.Library;
import ООП_Абстрактные_классы_и_интерфейсы.Building;
import java.time.LocalTime;
import java.util.HashMap;

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
        System.out.println("Адрес: " + getAddressBuildeing());
        System.out.println("Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("Имя архитектора: " + getName_architectBuildeing());
        System.out.println("Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("Часы работы библиотеки: "+getHoursOfOperation());
        System.out.println("Библиотека в данный момент : "+openLibrary());
        System.out.println("Обновление списка литературы в библиотеке: "+ BookByAuthorOfLibrary.addBookOfLibrary());

        System.out.println("Количество книг в библиотеке: "+getNumBooks());
        return null;
    }
    //методом String displayBookOfLibrary() вытягиваем из класса BookByAuthorOfLibrary список книг которые есть у нас в библиотеке
    public static HashMap<String, String> displayBookOfLibrary(){
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
}


