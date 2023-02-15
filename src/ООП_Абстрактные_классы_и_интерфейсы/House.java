package ООП_Абстрактные_классы_и_интерфейсы;

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

}

