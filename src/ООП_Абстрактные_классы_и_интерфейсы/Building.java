package ООП_Абстрактные_классы_и_интерфейсы;

public abstract class Building {
    String titleBuildeing;
    String addressBuildeing;
    int year_of_constructionBuildeing;
    String name_architectBuildeing;
    boolean cultural_monumentBuildeing;

    public Building(String titleBuildeing,
                    String addressBuildeing,
                    int year_of_constructionBuildeing,
                    String name_architectBuildeing,
                    boolean cultural_monumentBuildeing
    ){
        this.titleBuildeing=titleBuildeing;
        this.addressBuildeing=addressBuildeing;
        this.year_of_constructionBuildeing=year_of_constructionBuildeing;
        this.name_architectBuildeing=name_architectBuildeing;
        this.cultural_monumentBuildeing=cultural_monumentBuildeing;
    }

    //Getter  Setter
    //get/set название постройки
    public String getTitleBuildeing(){
        return titleBuildeing;
    }
    public void setTitleBuildeing(){
        this.titleBuildeing=titleBuildeing;
    }

    //get/set адрес постройки
    public String getAddressBuildeing(){
        return titleBuildeing;
    }
    public void setAddressBuildeing(){
        this.addressBuildeing=addressBuildeing;
    }

    //get/set год постройки
    public int getYear_of_constructionBuildeing(){
        return year_of_constructionBuildeing;
    }
    public void setYear_of_constructionBuildeing(){
        this.year_of_constructionBuildeing=year_of_constructionBuildeing;
    }

    //get/set имя архитектора
    public String getName_architectBuildeing(){
        return name_architectBuildeing;
    }
    public void setName_architectBuildeing(){
        this.name_architectBuildeing=name_architectBuildeing;
    }

    //is/set является ли культурным объектом
    public boolean isCultural_monumentBuildeing(){
        return cultural_monumentBuildeing;
    }
    public void setCultural_monumentBuildeing(){
        this.cultural_monumentBuildeing=cultural_monumentBuildeing;
    }

    //TODO
    //МЕТОДЫ
    //метод displayInfo() -> Вывод информации о здании
    public void displayInfo(){

    }

    //class Building абстрактный -> реализуем метод в подклассах

    //метод обработки "В каком районе находится здание?"
    public String locatedBuilding() {
        return locatedBuilding();
    }
    //метод tallBuilding() -> Это здание является высотным ? (переопределяется подклассами)
    public String tallBuilding(){
        return tallBuilding();
    }
}
