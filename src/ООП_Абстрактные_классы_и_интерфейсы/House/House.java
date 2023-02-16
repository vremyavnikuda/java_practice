package ООП_Абстрактные_классы_и_интерфейсы.House;
import ООП_Абстрактные_классы_и_интерфейсы.Building;

//House
public class House extends Building {
    //int numRooms -> кол-во комнат в House
    private int numRooms;

    //кол-во этажей в доме?
    private int numberFloorsHouse;

    //Есть ли бассейн?
    private boolean whetherPoolHouse;

    //Есть ли гараж?
    private boolean garageHouse;

    //-> Добавить метод определяющий на сколько автомобилей рассчитан гараж
    private int numGarageHouse;
    public House(
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
        this.numRooms=numRooms;
        this.numberFloorsHouse=numberFloorsHouse;
        this.whetherPoolHouse=whetherPoolHouse;
        this.garageHouse=garageHouse;
        this.numGarageHouse=numGarageHouse;
    }

    //Getter/Setter
    //get/set numHouse -> кол-во комнат в House
    public int getNumHouse(){
        return numRooms;
    }
    public void setNumHouse(int numRooms){
        this.numRooms=numRooms;
    }

    //get/set numberFloorsHouse -> кол-во этажей в доме?
    public int getNumberFloorsHouse(){
        return numberFloorsHouse;
    }
    public void setNumberFloorsHouse(int numberFloorsHouse){
        this.numberFloorsHouse=numberFloorsHouse;
    }

    //get/set whetherPoolHouse -> Есть ли бассейн??
    public boolean isWhetherPoolHouse(){
        return whetherPoolHouse;
    }
    public void setWhetherPoolHouse(boolean whetherPoolHouse){
        this.whetherPoolHouse=whetherPoolHouse;
    }

    //get/set garageHouse -> Есть ли гараж?
    public boolean isGarageHouse(){
        return garageHouse;
    }
    public void setGarageHouse(boolean garageHouse){
        this.garageHouse=garageHouse;
    }
    //-> Добавить метод определяющий на сколько автомобилей рассчитан гараж
    public int getNumGarageHouse(){
        return numGarageHouse;
    }
    public void setNumGarageHouse(int numGarageHouse){
        this.numGarageHouse=numGarageHouse;
    }

    //МЕТОДЫ класса class House
    //метод displayInfo() -> отображает информацию о классе House -> переопределение метода класса Building displayInfo()
    public Runnable displayInfo(){
        System.out.println("Здание: " + getTitleBuildeing());
        System.out.println("Адрес: " + getAddressBuildeing());
        System.out.println("Год постройки: " + getYear_of_constructionBuildeing());
        System.out.println("Имя архитектора: " + getName_architectBuildeing());
        System.out.println("Культурное наследие: " + isCultural_monumentBuildeing());
        System.out.println("Хватит ли семье class Family места в гараже для автомобилей? :"+hasEnoughSpaceInGarage());
        return null;
    }

    //Хватит ли семье class Family места в гараже для автомобилей?
    public String hasEnoughSpaceInGarage(){
        if (isGarageHouse()){
            if (getNumGarageHouse()>=Family.numbCarFamily){
                return "Да";
            }else{
                return "Нет";
            }
        } else if (getNumGarageHouse()<Family.numbCarFamily) {
            return "Нет";
        }else {
            return "У дома нет гаража";
        }
    }
    //Хватит ли комнат для семьи class Family в доме?
}

