package ООП_Абстрактные_классы_и_интерфейсы.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
/*
Данный класс является наследником Library предназначен для:
-Добавления книг в библиотеку
-Список книг будем хранить в HashMap<String,String>  bookOfLibrary
-Отображения книг, которые есть в библиотеке
*/
public class BookByAuthorOfLibrary extends Library{

    public BookByAuthorOfLibrary(String titleBuildeing,
                                 String addressBuildeing,
                                 int year_of_constructionBuildeing,
                                 String name_architectBuildeing,
                                 boolean cultural_monumentBuildeing,
                                 int numBooks,
                                 String librarian,
                                 String hoursOfOperation) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing,
                numBooks,
                librarian,
                hoursOfOperation);
    }
    //Представляем книги в виде элементов HashMap (Ключ==Автор книги/Значение==Название книги)
    public static HashMap<String,String> bookOfLibrary = new HashMap<String,String>();

    //Метод отображения книг из библиотеки HashMap -> bookOfLibrary
    public static String displayBookOfLibrary(){
        StringBuilder sb=new StringBuilder();
        for (String key:bookOfLibrary.keySet()){
            String value=bookOfLibrary.get(key);
            sb.append("\t").append(key).append(" - ").append(value).append("\n");
        }
        return sb.toString();
    }

    //Метод добавления книг в библиотеке HashMap -> bookOfLibrary
    //Читаем файл books.txt и заносим данные из файла в HashMap bookOfLibrary
    public static String addBookOfLibrary(){
        try {
            //открываем файл books.txt для чтения файла
            File file=new File("F:\\repository\\java_practice\\src\\ООП_Абстрактные_классы_и_интерфейсы\\Library\\books.txt");
            Scanner readFilesBooks=new Scanner(file);

            //Обращаемся к hashMap для хранения книг и авторов
            //HashMap<String,String>  bookOfLibrary = new HashMap<String,String>();
            //считываем каждую строку из файла, разбиваем ее на название книги и автора
            //и добавляем -> HashMap bookOfLibrary
            while (readFilesBooks.hasNextLine()){
                String line=readFilesBooks.nextLine();
                String []bookInfo=line.split(" - ");
                String bookTitle=bookInfo[0].trim();
                String bookAuthor=bookInfo[1].trim();
                bookOfLibrary.put(bookAuthor,bookTitle);
            }
            //закрываем файл
            readFilesBooks.close();

            //HashMap с книгами и авторами(книг)
            System.out.println("---------------");
            System.out.println("\t" +file.getName() +" успешно прочитал");
            System.out.println("\t" +"Список книг был успешно добавлен.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Library.displayBookOfLibrary();
    }
}
