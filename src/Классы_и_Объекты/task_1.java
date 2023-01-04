package Классы_и_Объекты;

public class task_1 {
    public static void main(String[] args){
        //создание нового объекта
        Person tom=new Person();
        tom.displayInfo();

        //изменяем имя и возрасты
        tom.name="Tom";
        tom.age=34;
        tom.displayInfo();
    }

    //класс Person
    static class Person{
        String name;//имя
        int age;//возраст

        //выводим информацию в консоль
        void displayInfo(){
            System.out.printf("Name: %s \tAge: %d\n",name,age);
        }
    }
}
