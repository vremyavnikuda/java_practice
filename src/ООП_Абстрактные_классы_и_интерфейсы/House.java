package ООП_Абстрактные_классы_и_интерфейсы;

//House
public class House extends Building {
    //int numRooms -> кол-во комнат в House
    private int numRooms;
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
    }
    //get/set numHouse
    public int getNumHouse(){
        return numRooms;
    }
    public void setNumHouse(int numRooms){
        this.numRooms=numRooms;
    }
}

