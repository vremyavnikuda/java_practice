package ООП_Абстрактные_классы_и_интерфейсы;

public abstract class Building {

    //Название
    String titleBuildeing;

    //Адрес
    String addressBuildeing;

    //Год постройки
    int year_of_constructionBuildeing;

    //Имя архитектора
    String name_architectBuildeing;

    //Является ли культурным памятников
    boolean cultural_monumentBuildeing;

    public Building(String titleBuildeing,
                    String addressBuildeing,
                    int year_of_constructionBuildeing,
                    String name_architectBuildeing,
                    boolean cultural_monumentBuildeing
    ) {
        this.titleBuildeing = titleBuildeing;
        this.addressBuildeing = addressBuildeing;
        this.year_of_constructionBuildeing = year_of_constructionBuildeing;
        this.name_architectBuildeing = name_architectBuildeing;
        this.cultural_monumentBuildeing = cultural_monumentBuildeing;
    }

    //Getter  Setter
    //get/set название постройки
    public String getTitleBuildeing() {
        return titleBuildeing;
    }

    public void setTitleBuildeing() {
        this.titleBuildeing = titleBuildeing;
    }

    //get/set адрес постройки
    public String getAddressBuildeing() {
        return addressBuildeing;
    }

    public void setAddressBuildeing() {
        this.addressBuildeing = addressBuildeing;
    }

    //get/set год постройки
    public int getYear_of_constructionBuildeing() {
        return year_of_constructionBuildeing;
    }

    public void setYear_of_constructionBuildeing() {
        this.year_of_constructionBuildeing = year_of_constructionBuildeing;
    }

    //get/set имя архитектора
    public String getName_architectBuildeing() {
        return name_architectBuildeing;
    }

    public void setName_architectBuildeing() {
        this.name_architectBuildeing = name_architectBuildeing;
    }

    //is/set является ли культурным объектом
    public String isCultural_monumentBuildeing() {
        if (cultural_monumentBuildeing) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public void setCultural_monumentBuildeing() {
        this.cultural_monumentBuildeing = cultural_monumentBuildeing;
    }

    //TODO
    //МЕТОДЫ
    //метод displayInfo() -> Вывод информации о здании
    public Runnable displayInfo() {
        return null;
    }

    //class Building абстрактный -> реализуем метод в подклассах

    //метод tallBuilding() -> Это здание является высотным ? (переопределяется подклассами)
    public String tallBuilding() {
        return tallBuilding();
    }

    //показать методы доступные объектам (данный метод переопределяется -> подклассами)
    public void displayMethod() {

    return;
    }
}
