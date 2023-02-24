package ООП_Абстрактные_классы_и_интерфейсы.Police;

import ООП_Абстрактные_классы_и_интерфейсы.Building;

//PoliceDepartment
public class PoliceDepartment extends Building {

    //int policeOfficers -> кол-во офицеров в PoliceDepartment
    private int policeOfficers;

    //int carDepartment -> кол-во полицейских машин в PoliceDepartment
    private int carDepartment;

    //int numPreDetentionCells кол-во камер предварительного заключения
    private static int numPreDetentionCells;

    //int numPeopleCameraDesigned -> на сколько человек рассчитана камера
    private static int numPeopleCameraDesigned;

    public PoliceDepartment(
            String titleBuildeing,
            String addressBuildeing,
            int year_of_constructionBuildeing,
            String name_architectBuildeing,
            boolean cultural_monumentBuildeing,
            int carDepartment,
            int numPreDetentionCells,
            int numPeopleCameraDesigned,
            int policeOfficers
    ) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing
        );
        this.carDepartment = carDepartment;
        PoliceDepartment.numPreDetentionCells = numPreDetentionCells;
        PoliceDepartment.numPeopleCameraDesigned = numPeopleCameraDesigned;
        this.policeOfficers = policeOfficers;
    }

    //get/set policeOfficers
    public int getPoliceOfficers() {
        return policeOfficers;
    }

    public void setPoliceOfficers(int policeOfficers) {
        this.policeOfficers = policeOfficers;
    }

    //get/set carDepartment
    public int getCarDepartment() {
        return carDepartment;
    }

    public void setCarDepartment(int carDepartment) {
        this.carDepartment = carDepartment;
    }

    //get/set numPreDetentionCells=кол-во камер предварительного заключения
    public static int getNumPreDetentionCells() {
        return numPreDetentionCells;
    }

    public void setNumPreDetentionCells(int numPreDetentionCells) {
        PoliceDepartment.numPreDetentionCells = numPreDetentionCells;
    }

    //get/set int numPeopleCameraDesigned -> на сколько человек рассчитана камера
    public static int getNumPeopleCameraDesigned() {
        return numPeopleCameraDesigned;
    }

    public void setNumPeopleCameraDesigned(int numPeopleCameraDesigned) {
        PoliceDepartment.numPeopleCameraDesigned = numPeopleCameraDesigned;
    }

    //Методы

    //метод displayInfo() -> отображает информацию о классе PoliceDepartment -> переопределение метода класса Building displayInfo()
    @Override
    public Runnable displayInfo() {
        System.out.println("Здание: " + getTitleBuildeing());
        System.out.println("\t" + "Адрес: " + getAddressBuildeing());
        System.out.println("\t" + "Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("\t" + "Имя архитектора: " + getName_architectBuildeing());
        System.out.println("\t" + "Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("\t" + "Количество офицеров работающих в департаменте: " + getPoliceOfficers());
        System.out.println("\t" + "Количество машин в департаменте : " + getCarDepartment());
        System.out.println("\t" + "Количество камер предварительного заключения в департаменте: " + getNumPreDetentionCells());
        System.out.println("\t" + "На сколько заключенных рассчитана камера: " + getNumPeopleCameraDesigned());
        System.out.println("\t" + "Сколько заключенных может содержать департамент: " + (getNumPreDetentionCells() * getNumPeopleCameraDesigned()));
        //System.out.println(DetentionCells.checkFreePlace());
        return null;
    }

    //метод displayMethod() -> Доступные методы для объектов созданных данным классом
    @Override
    public void displayMethod(){

    }
}


