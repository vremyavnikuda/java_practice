package oop_Инициализаторы_static_final.Инициализатор;

class Main{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        System.out.println(duck.toString());
        duck.display();
        duck.holiday();
        duck.display();
        duck.holiday(5);
        duck.display();
        duck.holiday(0.4);
        duck.display();
        duck.holiday(0.3, 2);
        duck.display();
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwimm());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();
        b.toString();

        //вызываем метод toString() для получения информации и объекте
        //класса Animal
        System.out.println(b.toString());


        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();
        f.toString();
        f.rename("Плавплавыч");
        f.hashCode();
        Fish.printDescription();
        System.out.println(f.name);

        //вызываем метод toString() для получения информации и объекте
        //класса Animal
        System.out.println(f.toString());

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();

        //вызываем метод toString() для получения информации и объекте
        //класса Animal
        System.out.println(i.toString());

        //вызываем description (хранит описание класса и его методы)
        Animal.printDescription();
    }
}