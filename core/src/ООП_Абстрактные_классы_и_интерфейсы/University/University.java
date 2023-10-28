package ООП_Абстрактные_классы_и_интерфейсы.University;

import ООП_Абстрактные_классы_и_интерфейсы.Building;

//University
public class University extends Building {

    //int numStudents -> кол-во студентов в University
    private int numStudentsUniversity;

    //Кол-во факультетов в University
    private int facultiesUniversity;

    //Наличие общежития
    private boolean docmitoryUniversity;

    //Наличие спортивных объектов
    private boolean sportFacilitiesUniversity;

    //Наличие медицинского центра
    private boolean medicalCenterUniversity;


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
        {
            numStudentsUniversity = numStudentsUniversity;
            facultiesUniversity = facultiesUniversity;
            docmitoryUniversity = docmitoryUniversity;
            sportFacilitiesUniversity = sportFacilitiesUniversity;
            medicalCenterUniversity = medicalCenterUniversity;
        }

    }

    //TODO
    //GET/SET
    // private int numStudents -> кол-во студентов в University
    public int getNumStudentsUniversity() {
        return numStudentsUniversity;
    }

    public void setNumStudentsUniversity(int numStudentsUniversity) {
        this.numStudentsUniversity = numStudentsUniversity;
    }

    //private int facultiesUniversity -> Кол-во факультетов в University
    public int getFacultiesUniversity() {
        return facultiesUniversity;
    }
    public void setFacultiesUniversity(int facultiesUniversity) {
        this.facultiesUniversity = facultiesUniversity;
    }

    //private boolean docmitoryUniversity -> Наличие общежития
    public String isDocmitoryUniversity() {
        if (docmitoryUniversity){
            return "Да";
        }else {
            return "Нет";
        }
    }

    public void setDocmitoryUniversity(boolean docmitoryUniversity) {
        this.docmitoryUniversity = docmitoryUniversity;
    }

    // private boolean sportFacilitiesUniversity -> Наличие спортивных объектов
    public String isSportFacilitiesUniversity() {
        if (sportFacilitiesUniversity){
            return "Да";
        }else{
            return "Нет";
        }
    }

    public void setSportFacilitiesUniversity(boolean sportFacilitiesUniversity) {
        this.sportFacilitiesUniversity = sportFacilitiesUniversity;
    }

    //private boolean medicalCenterUniversity -> Наличие медицинского центра
    public String isMedicalCenterUniversity() {
        if (medicalCenterUniversity){
            return "Да";
        }else{
            return "Нет";
        }
    }
    public void setMedicalCenterUniversity(boolean medicalCenterUniversity) {
        this.medicalCenterUniversity = medicalCenterUniversity;
    }

    @Override
    public String toString() {
        return "University{" +
                "numStudentsUniversity=" + numStudentsUniversity +
                ", facultiesUniversity=" + facultiesUniversity +
                ", docmitoryUniversity=" + docmitoryUniversity +
                ", sportFacilitiesUniversity=" + sportFacilitiesUniversity +
                ", medicalCenterUniversity=" + medicalCenterUniversity +
                '}';
    }
    @Override
    public void displayMethod(){
        System.out.println(
                "{\n" +
                        "\tnumStudentsUniversity:\n" +
                        "\t\tgetNumStudentsUniversity()\n" +
                        "\t\tsetNumStudentsUniversity()\n" +
                        "\tfacultiesUniversity:\n" +
                        "\t\tgetFacultiesUniversity()\n" +
                        "\t\tsetFacultiesUniversity()\n" +
                        "\tdocmitoryUniversity:\n" +
                        "\t\tisDocmitoryUniversity()\n" +
                        "\t\tsetDocmitoryUniversity()\n" +
                        "\tsportFacilitiesUniversity:\n" +
                        "\t\tisSportFacilitiesUniversity()\n" +
                        "\t\tsetSportFacilitiesUniversity()\n" +
                        "\tmedicalCenterUniversity:\n" +
                        "\t\tisMedicalCenterUniversity()\n" +
                        "\t\tsetMedicalCenterUniversity()\n"
                        + "}");
        return;
    }
}

