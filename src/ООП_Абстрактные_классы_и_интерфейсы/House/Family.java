package ООП_Абстрактные_классы_и_интерфейсы.House;

public class Family extends House {
    /*
    Данный класс Family.
    Добавить поля класса
    -> Состав семьи
    -> Есть ли дети?
    -> Если да,то сколько ?
    -> Список комнат в доме
    -> Хватает ли комнат каждому члену семьи ?
    -> Есть ли автомобиль у семьи?
    -> Если да то сколько автомобилей в семье ?
    -> Хватит ли места в гараже для автомобилей?
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
