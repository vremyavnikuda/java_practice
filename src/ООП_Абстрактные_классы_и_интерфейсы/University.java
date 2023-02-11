package ООП_Абстрактные_классы_и_интерфейсы;

//University
public class University extends Building {

    //int numStudents -> кол-во студентов University
    private int numStudents;
    public University(
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
    this.numStudents=numStudents;
    }

    //get/set private int numStudents
    public int getNumStudents(){
        return numStudents;
    }
    public void setNumStudents(int numStudents){
        this.numStudents=numStudents;
    }
}

