package oop_Инициализаторы_static_final.Инициализатор;

final class Fish extends Animal {
    //тип чешуи
    String squama;
    //умеет ли плавать против течения
    boolean upStreamSwim;
    String description="Данный класс Fish и наследуется от класса Animal \nсодержит переменные типа String squama и boolean upStreamSwim\n"+
            "так же он содержит статический инициализатор и методы\n"+
            "{\npublic void bul_bul()\n"+"public  void display()\n"+"public void rename()\n}" ;
    public Fish() {
        super();
        this.description=printDescription(description);
    }

    //инициализатор
    static {
        String name="Unknown";
        String type="Unknown";
    }

    /*
    У рыб должны быть новые свойства:
    squama - тип чешуи
    upStreamSwim - умеет ли плавать против течения
    */

    public void setSquama(String squama) {
        this.squama=squama;
    }
    public String getSquama() {
        return squama;
    }
    public String isUpStreamSwim() {
        if (upStreamSwim==true){
            return "Умеет ли плавать против течения?: Да";
        }else {
            return "Умеет ли плавать против течения?: Нет";
        }
    }
    public boolean setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim=upStreamSwim;
        return upStreamSwim;
    }

    //метод bul_bul, который выводит на экран строку "Bul-bul".
    public void bul_bul(){
        System.out.println("Bul-bul");
        System.out.println("--------------------------------");
    }
    @Override
    public  void display(){
        //получаем название класса через getSimpleName()
        System.out.println("I am "+Fish.class.getSimpleName());
    }

    //метод был переопределен (так как класс Fish получил ключевое слово "final")
    public void rename(String Rename){
        name=Rename;
    }
    public static String printDescription(String description){
        System.out.println(description);
        return description;
    }
}
