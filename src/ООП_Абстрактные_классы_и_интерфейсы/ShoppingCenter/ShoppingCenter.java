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
    public String isParkingShoppingCenter() {
        if (parkingShoppingCenter==true){
            return "Да";
        }else {
            return "Нет";
        }
    }

    public void setParkingShoppingCenter(boolean parkingShoppingCenter) {
        this.parkingShoppingCenter = parkingShoppingCenter;
    }

    //get/set securityShoppingCenter -> наличие службы охраны и безопасности
    public String isSecurityShoppingCenter() {
        if (securityShoppingCenter==true){
            return "Да";
        }else {
            return "Нет";
        }
    }

    public void setSecurityShoppingCenter(boolean securityShoppingCenter) {
        this.securityShoppingCenter = securityShoppingCenter;
    }

    @Override
    public String toString() {
        return "ShoppingCenter{" +
                "numStores=" + numStores +
                ", floorNumber=" + floorNumber +
                ", parkingShoppingCenter=" + parkingShoppingCenter +
                ", securityShoppingCenter=" + securityShoppingCenter +
                '}';
    }

    @Override
    public void displayMethod(){
            System.out.println(
                "{\n" +
                    "\tnumStores:\n" +
                    "\t\tgetNumStores()\n" +
                    "\t\tsetNumStores\n" +
                    "\tfloorNumber:\n" +
                    "\t\tgetFloorNumber()\n" +
                    "\t\tsetFloorNumber()\n" +
                    "\tparkingShoppingCenter:\n" +
                    "\t\tisParkingShoppingCenter()\n" +
                    "\t\tsetParkingShoppingCenter()\n" +
                    "\tsecurityShoppingCenter:\n" +
                    "\t\tisSecurityShoppingCenter()\n" +
                    "\t\tsetSecurityShoppingCenter()\n"
                + "}");
        return;
    }

    @Override
    public Runnable displayInfo(){
        System.out.println("Здание: " + getTitleBuildeing());
        System.out.println("\t" + "Адрес: " + getAddressBuildeing());
        System.out.println("\t" + "Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("\t" + "Имя архитектора: " + getName_architectBuildeing());
        System.out.println("\t" + "Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("\t" + "Количество магазинов в Shopping Center: " + getNumStores());
        System.out.println("\t" + "Количество этажей в ShoppingCenter : " + getFloorNumber() );
        System.out.println("\t" + "Наличие собственной парковки в : " + isParkingShoppingCenter());
        System.out.println("\t" + "Наличие собственной службы безопасности : " + isSecurityShoppingCenter());
        return null;
    }
}
