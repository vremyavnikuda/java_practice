package ООП_Абстрактные_классы_и_интерфейсы;

//HighRiseBuilding
public class HighRiseBuilding extends Building {

    //boolean elevator -> если в здании лифт(true/false)
    private boolean elevator;

    //int numFloors -> количество этажей в HighRiseBuilding
    private int numFloors;

    // String nameComplex -> название жилого комплекса (к которому относится данное здание)
    private String nameComplex;

    //Конструктор класса HighRiseBuilding
    public HighRiseBuilding(
            String titleBuildeing,
            String addressBuildeing,
            int year_of_constructionBuildeing,
            String name_architectBuildeing,
            boolean cultural_monumentBuildeing,
            boolean elevator,
            int numFloors,
            String nameComplex
    ) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing
        );
        this.numFloors = numFloors;
        this.elevator = elevator;
        this.nameComplex = nameComplex;
    }

    //Getter/Setter
    //get/set int numFloors
    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    //is/set boolean elevator
    public String isElevator() {
        if (elevator) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public boolean setElevator(boolean elevator) {
        this.elevator = elevator;
        return elevator;
    }

    //get/set String nameComplex
    public String getNameComplex() {
        return nameComplex;
    }

    public String setNameComplex(String nameComplex) {
        this.nameComplex = nameComplex;
        return nameComplex;
    }

    //МЕТОДЫ

    //метод displayInfo() -> отображение информации о классе HighRiseBuilding -> переопределение метода
    //класса Building displayInfo()
    @Override
    public Runnable displayInfo() {
        System.out.println("Здание: " + getTitleBuildeing());
        System.out.println("\t" +"Адрес: " + getAddressBuildeing());
        System.out.println("\t" +"Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("\t" +"Имя архитектора: " + getName_architectBuildeing());
        System.out.println("\t" +"Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("\t" +"Здание находится в: " + locationBuilding("Центральном") + " районе");
        System.out.println("\t" +"Здание является высотным " + tallBuilding());
        System.out.println("\t" +"Если лифт в здании? " + isElevator());
        System.out.println("\t" +"Количество этажей: " + getNumFloors());
        System.out.println("\t" +"Здание находится в жилом комплексе: " + getNameComplex());
        return null;
    }

    //В каком районе находится здание
    public String locationBuilding(String location){
        return location;
    }

    //метод tallBuilding() -> Это здание является высотным ?
    @Override
    public String tallBuilding() {
        if (numFloors > 10) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    //метод displayMethod() -> Доступные методы для объектов созданных данным классом
    @Override
    public void displayMethod() {
        System.out.println("---------------");
        System.out.println("Имя класса: HighRiseBuilding.");
        System.out.println("Данный класс является подклассом: Building.");
        System.out.println(
                """
                        Доступные методы: для объектов данного класса:\s
                        \tметод locatedBuilding() -> В каком районе находится здание?
                        \tметод tallBuilding() -> Это здание является высотным ?
                        \tметод displayInfo() -> отображение информации о классе HighRiseBuilding -> переопределение метода.
                        \tметод displayMethod() -> -> Доступные методы для объектов созданных данным классом.""");
        return;
    }
}