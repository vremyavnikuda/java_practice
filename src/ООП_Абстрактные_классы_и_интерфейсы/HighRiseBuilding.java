package ООП_Абстрактные_классы_и_интерфейсы;

import java.util.Scanner;
/*
    Реализовать метод отображения класса
    данный метод должен описывать все доступные методы в классе
    -> как они работают и как с ними взаимодействовать
*/

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
        this.elevator=elevator;
        this.nameComplex=nameComplex;
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
        if (elevator){
            return "Да";
        }else {
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
        System.out.println("Адрес: " + getAddressBuildeing());
        System.out.println("Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("Имя архитектора: " + getName_architectBuildeing());
        System.out.println("Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("Здание находится в: " + locatedBuilding()+" районе");
        System.out.println("Здание является высотным " + tallBuilding());
        System.out.println("Если лифт в здании? "+ isElevator());
        System.out.println("Количество этажей: "+ getNumFloors());
        System.out.println("Здание находится в жилом комплексе: "+getNameComplex());
        return null;
    }
    //метод locatedBuilding() "В каком районе находится здание?"
    //В данном методе, мы получаем данные от пользователя
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
            return "Да";
        }else {
            return "Нет";
        }
    }
}

