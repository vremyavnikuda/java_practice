package ООП_Абстрактные_классы_и_интерфейсы.Police;


// DetentionCells -> камеры предварительного заключения полицейского департамента -> PoliceDepartment

import java.io.*;
import java.util.Arrays;

public class DetentionCells extends PoliceDepartment {

    //Камера предварительного заключения (представлена в виде массива данных)
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
    public static int[] checkFreePlace() throws IOException {
        int[] freePlaces = new int[remandPrison.length];
        //флаг для отслеживания состояния операции чтения данных из файла
        boolean flagReadFiles = false;
        //читаем файл PrisonData.txt, где хранится информация о статусе камер
        try {
            BufferedReader reader = new BufferedReader((new FileReader("E:\\java_practice\\src\\ООП_Абстрактные_классы_и_интерфейсы\\Police\\PrisonData.txt")));
            String line = reader.readLine();
            String[] value = line.substring(1, line.length() - 1).split("\\]\\[");

            for (int i = 0; i < value.length; i++) {
                remandPrison[i] = Integer.parseInt(String.valueOf(value[i]));
            }
            reader.close();
            //если операция прошла успешно -> flagReadFiles == true
            flagReadFiles = true;
            System.out.println("Список камер был обновлен из файла.");
        } catch (IOException e) {
            //Операция не прошла успешно -> flagReadFiles == false
            flagReadFiles = false;
            System.out.println("ERROR\n Проверьте правильность заполнения данных в файле PrisonData.txt");
        }
        //Проверяем наличие свободных мест в камерах
        int count = 0;
        //флаг для отслеживания наличия свободных мест в камерах
        boolean flagFreePlaces = false;
        for (int i = 0; i < remandPrison.length; i++) {
            int dif = getNumPeopleCameraDesigned() - remandPrison[i];
            if (remandPrison[i] >= PoliceDepartment.getNumPeopleCameraDesigned()) {
                count++;
                //Нет свободных мест -> flagFreePlaces == false
                flagFreePlaces = false;
                System.out.println("\tВ камере :" + " №" + count + " нет свободных мест");
            } else {
                //Есть свободные места -> flagFreePlaces == true
                flagFreePlaces = true;
                System.out.println("\tВ камере :" + " №" + count + " свободных мест : " + dif);
            }
        }
        return freePlaces;
    }

    //Сохраняем в файл данные о наполняемости камер
    public static void saveRemandPrisonFiles() {
        try {
            FileWriter writer = new FileWriter("E:\\java_practice\\src\\ООП_Абстрактные_классы_и_интерфейсы\\Police\\PrisonData.txt");
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
    public static Serializable addInmateToCells() throws IOException {
        int[] freePlaces = new int[remandPrison.length];
        System.arraycopy(remandPrison, 0, freePlaces, 0, remandPrison.length);
        System.out.println("remandPrison -> copy -> freePlaces");
        int freeCameraIndex = 0;
        boolean flagAddInmateToCells = false;
        //Поиск камеры с числом мест меньше >getNumPeopleCameraDesigned()
        for (int i = 0; i < freePlaces.length; i++) {
            if (freePlaces[i] < getNumPeopleCameraDesigned()) {
                freeCameraIndex = i;
                flagAddInmateToCells = true;
                System.out.println("Камера :" + freeCameraIndex + " есть места");
                System.out.println(flagAddInmateToCells);
                break;
            }
        }
        //если свободная камера найдена -> добавляем заключенного в эту камеру
        if (flagAddInmateToCells) {
            freePlaces[freeCameraIndex]++;
            System.out.println("Заключенный успешно добавлен в камеру №" + (freeCameraIndex));

        } else {
            throw new IOException("В данном департаменте нет свободных мест. Заключенный будет отправлен в другой департамент.");
        }
        for (int printFreePlaces : freePlaces) {
            System.out.print(printFreePlaces + " ");
        }
        //перезаписываем файл PrisonData.txt(обновляем данные)
        try {
            FileWriter writer = new FileWriter("E:\\java_practice\\src\\ООП_Абстрактные_классы_и_интерфейсы\\Police\\PrisonData.txt");
            for (int j : freePlaces) {
                writer.write(Arrays.toString(Integer.toString(j).split("/")));
            }
            writer.close();
            return "\tФайл с данными успешно сохранен";
        }
        catch (IOException e) {
            throw new IOException("ERROR\n Проверьте данные указанные в numPeopleCameraDesigned");
        }
        finally {
            System.out.println("Method complete");;
        }
    }

    //метод (выпустить заключенного)
    //аргументами метода будут являться int numberCell -> где numberCell является номером камеры откуда нужно выпустить заключенного
    //int numberConcluded ->где numberConcluded является количеством заключенных которых необходимо выпустить
    public static void removeInmateFhCell(int numberCell, int numberConcluded) throws IOException {
        int[] freePlaces = new int[remandPrison.length];
        System.arraycopy(remandPrison, 0, freePlaces, 0, remandPrison.length);
        System.out.print("remandPrison -> copy -> freePlaces");
        freePlaces[numberCell]-=numberConcluded;
        //перезаписываем файл PrisonData.txt(обновляем данные)
        try {
            FileWriter writer = new FileWriter("E:\\java_practice\\src\\ООП_Абстрактные_классы_и_интерфейсы\\Police\\PrisonData.txt");
            for (int j : freePlaces) {
                writer.write(Arrays.toString(Integer.toString(j).split("/")));
            }
            writer.close();
        }
        catch (IOException e) {
            throw new IOException("ERROR\n Проверьте данные указанные в numPeopleCameraDesigned");
        }
        finally {
            System.out.println("Method complete");;
        }
    }
    @Override
    public void displayMethod(){

    }
}
