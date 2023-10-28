package Классы_и_Объекты;

public class task_1 {
    public static void main(String[] args) {
        Person bob = new Person();//вызов первого конструктора без параметров
        bob.displayInfo();

        Person tom = new Person("Tom");//вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person sam = new Person("Sam", 25);//вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }

    //класс Person
    static class Person {
        String name;//имя
        int age;//возраст


        /*Получаем ссылку на текущий экземпляр класса через ключевое слово this.*/
        Person() {
            this("Undefined", 18);
        }
        /*
        В инициализатор можем поместить общий код для всех конструкторов
        Начало блока инициализатора
        {
            name="Undefined";
            age=18;
        }
        Конец блока инициализатора
        */

        Person(String name) {
            this(name, 18);
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //выводим информацию в консоль
        void displayInfo() {
            System.out.printf("Name: %s \tAge: %d\n", name, age);
        }
    }
}
