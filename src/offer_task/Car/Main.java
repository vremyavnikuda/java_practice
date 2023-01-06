package offer_task.Car;

import java.util.ArrayList; // импортируем класс ArrayList из пакета java.util
import java.util.Scanner;

/*class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(); // создаем список объектов типа Car
        Scanner scanner = new Scanner(System.in);

        while (true) { // бесконечный цикл
            System.out.print("Enter the name of the car (or ':q' to quit): ");
            String name = scanner.nextLine();
            if (name.equals(":q")) { // если пользователь ввел 'q', выходим из цикла
                break;
            }

            Car car = new Car(name); // создаем новый объект Car с именем, введенным пользователем
            cars.add(car); // добавляем созданный объект в список
        }

        // выводим список всех объектов
        for (Car car : cars) {
            System.out.println(car.name);
        }
    }
}*/
public class Main {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя объекта: ");
        String newNewCar = sc.nextLine();


        Object newCar = new Object();

        System.out.println(newCar);
    }
}


