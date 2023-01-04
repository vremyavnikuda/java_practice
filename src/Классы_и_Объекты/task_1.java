package Классы_и_Объекты;

public class task_1 {
    public static void main(String[] args) {
        Person bob = new Person();//вызов первого конструктора без параметров
        bob.displayInfo();

        Person tom = new Person("Tom");//вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person sam = new Person("Sam", 25);//вызов третьего конструктора с двумя параметрами
        sam.displayInfo();

        //КОНСТРУКТОР
        //изменяем имя и возрасты
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
    }

    //класс Person
    static class Person {
        String name;//имя
        int age;//возраст

        Person() {
            name = "Undefined";
            age = 18;
        }

        Person(String n) {
            name = n;
            age = 18;
        }

        Person(String n, int a) {
            name = n;
            age = a;
        }

        //выводим информацию в консоль
        void displayInfo() {
            System.out.printf("Name: %s \tAge: %d\n", name, age);
        }
    }
}
