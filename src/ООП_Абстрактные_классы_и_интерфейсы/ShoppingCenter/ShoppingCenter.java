package ООП_Абстрактные_классы_и_интерфейсы.ShoppingCenter;

import ООП_Абстрактные_классы_и_интерфейсы.Building;

//ShoppingCenter
public class ShoppingCenter extends Building {

    //int numStores -> количество магазинов в ShoppingCenter
    private int numStores;

    //int floorNumber -> количество этажей в ShoppingCenter
    private int floorNumber;

    //boolean parkingShoppingCenter -> есть ли парковка в ShoppingCenter
    private boolean parkingShoppingCenter;


    //boolean securityShoppingCenter -> наличие службы охраны и безопасности
    private boolean securityShoppingCenter;

    public ShoppingCenter(
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
        //конструктор numStores
        this.numStores = numStores;
        this.floorNumber = floorNumber;
        this.parkingShoppingCenter = parkingShoppingCenter;
        this.securityShoppingCenter = securityShoppingCenter;
    }

    //GET/SET

    //numStores -> количество магазинов в ShoppingCenter
    public int getNumStores() {
        return numStores;
    }

    public void setNumStores(int numStores) {
        this.numStores = numStores;
    }

    //get/set floorNumber -> количество этажей в ShoppingCenter
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    //get/set parkingShoppingCenter -> есть ли парковка в ShoppingCenter
    public boolean isParkingShoppingCenter() {
        return parkingShoppingCenter;
    }

    public void setParkingShoppingCenter(boolean parkingShoppingCenter) {
        this.parkingShoppingCenter = parkingShoppingCenter;
    }

    //get/set securityShoppingCenter -> наличие службы охраны и безопасности
    public boolean isSecurityShoppingCenter() {
        return securityShoppingCenter;
    }

    public void setSecurityShoppingCenter(boolean securityShoppingCenter) {
        this.securityShoppingCenter = securityShoppingCenter;
    }

    //TODO
    //Методы
    @Override
    public String toString() {
        return "";
    }

    @Override
    public void displayMethod() {
        return;
    }
}
