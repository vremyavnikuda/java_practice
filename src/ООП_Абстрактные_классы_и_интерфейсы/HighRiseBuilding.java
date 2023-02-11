package ООП_Абстрактные_классы_и_интерфейсы;

//HighRiseBuilding
public class HighRiseBuilding extends Building {
    // 3 cвойства HighRiseBuilding
    //boolean elevator -> если в здании лифт(true/false)
    private boolean elevator;
    //int numFloors -> количество этажей в HighRiseBuilding
    private int numFloors;
    // String nameComplex -> название жилого комплекса (к которому относится данное здание)
    private String nameComplex;

    public HighRiseBuilding(
            String titleBuildeing,
            String addressBuildeing,
            int year_of_constructionBuildeing,
            String name_architectBuildeing,
            boolean cultural_monumentBuildeing
    ){
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

    //get/set int numFloors
    public int getNumFloors(){
        return numFloors;
    }
    public void setNumFloors(int numFloors){
        this.numFloors=numFloors;
    }

    //is/set boolean elevator
    public boolean isElevator(){
        return elevator;
    }
    public void setElevator(boolean elevator){
        this.elevator=elevator;
    }

    //get/set String nameComplex
    public String getNameComplex(){
        return nameComplex;
    }
    public void setNameComplex(String nameComplex){
        this.nameComplex=nameComplex;
    }
    /*
    добавить 3 метода
    так же можно перегружать методы
    */
}
