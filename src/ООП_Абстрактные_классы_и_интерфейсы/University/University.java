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
    public boolean isDocmitoryUniversity() {
        return docmitoryUniversity;
    }

    public void setDocmitoryUniversity(boolean docmitoryUniversity) {
        this.docmitoryUniversity = docmitoryUniversity;
    }

    // private boolean sportFacilitiesUniversity -> Наличие спортивных объектов
    public boolean isSportFacilitiesUniversity() {
        return sportFacilitiesUniversity;
    }

    public void setSportFacilitiesUniversity(boolean sportFacilitiesUniversity) {
        this.sportFacilitiesUniversity = sportFacilitiesUniversity;
    }

    //private boolean medicalCenterUniversity -> Наличие медицинского центра
    public boolean isMedicalCenterUniversity() {
        return medicalCenterUniversity;
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

}

