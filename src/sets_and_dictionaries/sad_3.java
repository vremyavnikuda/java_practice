/*
Статистика по Персоналу
Вводится число n.
Затем 2*n строк.
Каждая пара строк - имя человека и его профессия.
Определите, сотрудников какой профессии больше всего.
Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились.
Гарантируется, что будет введено не более 100 сотрудников.

Sample Input:
7
Иван
Токарь
Семён
Программист
Анатолий
Кузнец
Вася
Финансист
Кирилл
Программист
Оля
Программист
Валера
Токарь

Sample Output:
3
Программист
Семён
Кирилл
Оля
*/
package sets_and_dictionaries;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class sad_3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        LinkedHashMap<String,Integer>name_work= new LinkedHashMap<>();
        LinkedHashMap<String,String>answer_hash= new LinkedHashMap<>();
        int count=0;
        String work,answer="",name;
        for(int i=1;i<=n;i++){
            name=sc.next();
            work=sc.next();
            answer_hash.put(name,work);
            if(name_work.containsKey(work)) {
                name_work.put(work, name_work.get(work) + 1);
            }
            else name_work.put(work,1);
            if(count<name_work.get(work)) {
                count = name_work.get(work);
                answer=work;
            }
        }
        System.out.println(count);
        System.out.println(answer);
        for(String q: answer_hash.keySet()){
            if(answer.equals(answer_hash.get(q)))
                System.out.println(q);
        }
    }
}
