package ООП_Абстрактные_классы_и_интерфейсы;

//ShoppingCenter
public class ShoppingCenter extends Building {

    //int numStores-> количество магазинов в ShoppingCenter
    private int numStores;

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
    }

    //get/set numStores
    public int getNumStores(){
        return numStores;
    }
    public void setNumStores(int numStores){
        this.numStores=numStores;
    }
}