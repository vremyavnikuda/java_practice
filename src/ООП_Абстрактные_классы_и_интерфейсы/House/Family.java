package ООП_Абстрактные_классы_и_интерфейсы.House;


// TODO: 16.02.2023 class Family наследует свойства и методы от class House
public class Family{

    //numFamilyComposition -> Количество членов семьи
    static int numFamilyComposition;

    // String[]familyComposition -> Состав семьи
    public String[]familyComposition =new String[numFamilyComposition];

    // hasChildren -> Есть ли дети?
    boolean hasChildren;

    // numberFamilyHasChildren -> Количество детей в семье
    int numberFamilyHasChildren;

    //hasCarFamily -> Есть ли автомобиль у семьи?
    boolean hasCarFamily;

    //numbCarFamily -> сколько автомобилей в семье ?
    static int numbCarFamily;

    public Family() {
        this.numFamilyComposition=numFamilyComposition;



    }
    //МЕТОДЫ
}
