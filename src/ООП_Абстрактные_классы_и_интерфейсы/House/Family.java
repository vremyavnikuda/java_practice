package ООП_Абстрактные_классы_и_интерфейсы.House;

public class Family extends House {
    /*
    Данный класс
    */
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
}
