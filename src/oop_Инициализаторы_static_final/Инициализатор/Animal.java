package oop_Инициализаторы_static_final.Инициализатор;

public class Animal {
    // определяем объекты класса
    String type;
    String name;
    int  age;
    double weight;
    private int day;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    //Статический метод и статическое свойство с описанием класса
    //которое может быть вызвано только у класса, но не у его объекта
    static String description="description это свойство метода printDescription ,которые может быть вызвано только именем класса";

    //инициализатор
    static {
        String name="Unknown";
        String type="Unknown";
    }

    //конструктор
    //создать животное с его типом и именем
    public Animal(){
        this.type=type;
        this.name=name;
        //System.out.println("--------------------");
    }

    //Конструктор
    //Создать животное с его типом и возрастом.
    // При этом в имени окажется значение "No Name"
    public Animal(String type,int age){
        this.type=type;
        this.age=age;
        this.name="No Name";
        //System.out.println("--------------------");
    }

    //Конструктор
    //Позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде.
    public Animal (String type,String name,int age,double weight,boolean isFly,boolean isWalk,boolean isSwim){
        this.type=type;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.isFly=isFly;
        this.isWalk=isWalk;
        this.isSwim=isSwim;
        //System.out.println("--------------------");
    }
    public Animal(String type, String name) {
        this.type=type;
        this.name=name;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public boolean isFly(){
        return isFly;
    }
    public boolean isWalk(){
        return isWalk;
    }
    public boolean isSwimm(){
        return isSwim;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setFly(boolean Fly){
        this.isFly=Fly;
    }
    public void setWalk(boolean Walk){
        this.isWalk=Walk;
    }
    public void setSwimm(boolean Swimm){
        this.isSwim=Swimm;
    }

    //Методы класса
    public void display(){
        StringBuilder sb=new StringBuilder();
        //условие работы метода display и исключениями(нет данных)
        if (type!=null){
            sb.append("Тип животного: ").append(type).append("\n");
        }else {
            sb.append("Тип животного: ").append("Нет данных").append("\n");
        }
        if (name!=null){
            sb.append("Имя животного: ").append(name).append("\n");
        }else {
            sb.append("Имя животного: ").append("Нет данных").append("\n");
        }

        if (age!=0){
            sb.append("Возраст животного: ").append(age ).append("\n");
        }
        else {
            sb.append("Возраст животного: ").append("Нет данных").append("\n");
        }
        //Умеет ли это животное летать?
        if (isFly==true){
            sb.append("Умеет ли это животное летать?: ").append("Да").append("\n");
        }
        else if (isFly!=true || isFly!=false) {
            sb.append("Умеет ли это животное летать?: ").append("Нет данных").append("\n");
        }
        else {
            sb.append("Умеет ли это животное летать?: ").append("Нет"+"\n");
        }
        //Умеет ли это животное ходить?
        if (isWalk==true){
            sb.append("Умеет ли это животное ходить?: ").append("Да").append("\n");
        }
        else if (isFly!=true || isFly!=false) {
            sb.append("Умеет ли это животное ходить?: ").append("Нет данных").append("\n");
        }
        else {
            sb.append("Умеет ли это животное ходить?: ").append("Нет" + "\n");
        }
        //Умеет ли это животное плавать?
        if (isSwim==true){
            sb.append("Умеет ли это животное плавать?: ").append("Да").append("\n");
        }
        else if (isFly!=true || isFly!=false) {
            sb.append("Умеет ли это животное плавать?: ").append("Нет данных").append("\n");
        }
        else {
            sb.append("Умеет ли это животное плавать?: ").append("Нет" + "\n");
        }

        System.out.println(sb.toString());
        System.out.println("-------------------------------------------------------------------------");
    }
    public void rename(String Rename){
        name=Rename;
    }
    public void holiday() {
        weight += 0.1;
    }
    public int holiday(int  n) {
        for (int i = 0; i < n; i++) {
            weight += 0.1;
        }
        return (int) weight;
    }

    public double holiday(double m) {
        weight += m;
        return weight;
    }

    public double holiday(double m, int n) {
        for (int i = 0; i < n; i++) {
            weight += m;
        }
        return weight;
    }
    public static void printDescription(){
        System.out.println(description);
    }
}
