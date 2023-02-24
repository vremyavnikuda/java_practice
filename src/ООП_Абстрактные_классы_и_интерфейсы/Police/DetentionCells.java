package ООП_Абстрактные_классы_и_интерфейсы.Police;


// DetentionCells -> камеры предварительного заключения полицейского департамента -> PoliceDepartment

public class DetentionCells extends PoliceDepartment {

    //Камера предварительного заключения (представлена в виде двумерного массива данных)
    public int[][] remandPrison = new int[getNumPreDetentionCells()][getNumPeopleCameraDesigned()];

    public DetentionCells(
            String titleBuildeing,
            String addressBuildeing,
            int year_of_constructionBuildeing,
            String name_architectBuildeing,
            boolean cultural_monumentBuildeing,
            int carDepartment,
            int numPreDetentionCells,
            int numPeopleCameraDesigned,
            int policeOfficer
    ) {
        super(
                titleBuildeing,
                addressBuildeing,
                year_of_constructionBuildeing,
                name_architectBuildeing,
                cultural_monumentBuildeing,
                carDepartment,
                numPreDetentionCells,
                numPeopleCameraDesigned,
                policeOfficer
        );
    }

    //метод проверки есть ли свободные камеры?

    public String checkFreePlace() {
        for (int i = 0; i < getNumPreDetentionCells(); i++) {
            int count = 0;
            for (int j = 0; j < getNumPeopleCameraDesigned(); j++) {
                if (remandPrison[i][j] == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return "Камера n: p заключенных: В камере нет мест";
            } else { // count is not 0
                return "Камера " + i + ":" + getNumPeopleCameraDesigned() + " заключенных: " + count + " свободных мест";
            }
        }
        return checkFreePlace();
    }

    //метод (поместить заключенного в камеру)

    //метод (выпустить заключенного)
}
