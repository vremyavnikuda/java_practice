package ООП_Абстрактные_классы_и_интерфейсы.House;

public class Family extends House {
    /*

    -> Хватает ли комнат каждому члену семьи ?

    -> Хватит ли места в гараже для автомобилей?
    */

    //numFamilyComposition -> Количество членов семьи
    int numFamilyComposition;
    // String[]familyComposition -> Состав семьи
    public String[]familyComposition =new String[numFamilyComposition];
    // hasChildren -> Есть ли дети?
    boolean hasChildren;
    // numberFamilyHasChildren -> Количество детей в семье
    int numberFamilyHasChildren;
    //hasCarFamily -> Есть ли автомобиль у семьи?
    boolean hasCarFamily;
    //numbCarFamily -> сколько автомобилей в семье ?
    int numbCarFamily;

    public Family(String titleBuildeing,
                  String addressBuildeing,
                  int year_of_constructionBuildeing,
                  String name_architectBuildeing,
                  boolean cultural_monumentBuildeing) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing
        );
    }
    //МЕТОДЫ
}
