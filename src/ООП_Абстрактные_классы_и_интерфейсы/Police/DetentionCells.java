package ООП_Абстрактные_классы_и_интерфейсы.Police;


// DetentionCells -> камеры предварительного заключения полицейского департамента -> PoliceDepartment

import java.io.*;
import java.util.Arrays;

public class DetentionCells extends PoliceDepartment {

    //Камера предварительного заключения (представлена в виде двумерного массива данных)
    public static int[] remandPrison = new int[getNumPreDetentionCells()];

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

    //TODO
    //МЕТОДЫ
    //Аргументы метода задаются в Main
    @Override
    public Runnable displayInfo() {
        return super.displayInfo();
    }

    //TODO

    //Устанавливаем значение (кол-во людей на которое рассчитана 1 камера)
    public static void fillRemandPrison() {
        Arrays.fill(remandPrison, getNumPeopleCameraDesigned());
    }

    //метод проверки есть ли свободные камеры?
    public static void checkFreePlace() throws IOException {
        //читаем файл PrisonData.txt, где хранится информация о статусе камер
        try{
            BufferedReader reader=new BufferedReader((new FileReader("PrisonData.txt")));
            String line= reader.readLine();
            String[]value=line.substring(1,line.length()-1).split("\\]\\[");
            for (int i =0;i< value.length;i++){
                remandPrison[i]=Integer.parseInt(value[i]);
            }
            reader.close();
            System.out.println("Список камер был обновлен из файла.");
        }catch (IOException e){
            System.out.println("ERROR\n Проверьте правильность заполнения данных в файле PrisonData.txt");
        }
        //Проверяем наличие свободных мест в камерах
        int count=0;
        for (int i=0;i<remandPrison.length;i++){
            int dif = getNumPeopleCameraDesigned()-remandPrison[i];
            if (remandPrison[i]>=PoliceDepartment.getNumPeopleCameraDesigned()) {
                count++;
                System.out.println("\tВ камере :" +" №"+count+" нет свободных мест");
            }
            else {
                System.out.println("\tВ камере :" +" №"+count + " свободных мест : "+dif);
            }
        }
    }

    //Сохраняем в файл данные о наполняемости камер
    public static void saveRemandPrisonFiles() {
        try {
            FileWriter writer = new FileWriter("PrisonData.txt");
            for (int j : remandPrison) {
                writer.write(Arrays.toString(Integer.toString(j).split("/")));
            }
            writer.close();
            System.out.println("\tФайл с данными успешно сохранен");
        } catch (IOException e) {
            System.out.println("ERROR\n Проверьте данные указанные в numPeopleCameraDesigned");
        }
    }
    //метод добавление заключенного в свободную камеру

    //метод (выпустить заключенного)
}
