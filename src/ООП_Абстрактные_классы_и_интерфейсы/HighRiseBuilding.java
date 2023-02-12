package ООП_Абстрактные_классы_и_интерфейсы;

import java.util.Scanner;

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
            boolean cultural_monumentBuildeing
    ) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing
        );
        //конструктор numFloors
        this.numFloors = numFloors;
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
    public boolean isElevator() {
        return elevator;
    }

    public String setElevator(boolean elevator) {
        this.elevator = elevator;
        if (elevator){
            return "YES";
        }else {
            return "NO";
        }
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
    public void displayInfo() {
        System.out.println("Здание: " + getTitleBuildeing());
        System.out.println("Адрес: " + getAddressBuildeing());
        System.out.println("Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("Имя архитектора: " + getName_architectBuildeing());
        System.out.println("Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("Здание находится в: " + locatedBuilding()+" районе");
        System.out.println("Здание является высотным " + tallBuilding());
        System.out.println("Если лифт в здании? "+ isElevator());
        System.out.println("Количество этажей: "+ getNumFloors());
        System.out.println("Здание находится в жилом комплексе: "+getNameComplex());
    }
    //метод locatedBuilding() "В каком районе находится здание?"
    @Override
    public String locatedBuilding() {
        Scanner input_locatedBuilding=new Scanner(System.in);
        System.out.println("В каком районе находится здание?");
        String located=input_locatedBuilding.nextLine();
        input_locatedBuilding.close();
        return located;
    }

    //метод tallBuilding() -> Это здание является высотным ?
    @Override
    public String tallBuilding() {
        if (numFloors>10){
            return "YES";
        }else {
            return "NO";
        }
    }
}

