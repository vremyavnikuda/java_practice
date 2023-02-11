package ООП_Абстрактные_классы_и_интерфейсы;

//PoliceDepartment
public class PoliceDepartment extends Building {

    //int policeOfficers -> кол-во офицеров в PoliceDepartment
    private int policeOfficers;
    public PoliceDepartment(
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
    this.policeOfficers=policeOfficers;
    }

    //get/set policeOfficers
    public int getPoliceOfficers(){
        return policeOfficers;
    }
    public void setPoliceOfficers(int policeOfficers){
        this.policeOfficers=policeOfficers;
    }
}


