/*
Словари и множества
Несколько друзей решили сыграть в игру: кто больше слов знает. Они сели за стол и стали записывать все слова,
которые только пришли им на ум. После чего стали сравнивать, у кого больше слов. В этот момент стало понятно, что некоторые ребята по ошибке записали какие-то слова несколько раз. Разумеется, повторяющиеся слова вычеркнули. Потом они поняли, что слов слишком много, поэтому решили считать только те, длина которых не меньше, чем K. Помогите ребятам узнать, кто же знает больше слов.
Гарантируется, что есть единственный победитель .
Входные данные:
Сначала вводится число n - количество ребят. Затем идёт n строк вида:
"Имя ребёнка: слово1 слово2 слово3 и т.д."
После чего вводится число K.
Выходные данные:
Выведите на экран имя ребёнка и количество слов, которое он знает (они не должны повторяться и их длина должна быть не меньше К).

Учтите, что некоторые слова дети могут написать в разных регистрах. Например, слова "Слово" и "слово" - это одно и то же.

Sample Input:
3
Андрей: гусь Мама папа крик машина кто где вот таз кар рак так
Маша: карлик планета монета Планета Карлик Монета
Игорь: ковролин математика физика кот суп душ май химия хитрость
5

Sample Output:
Игорь 5
*/
package sets_and_dictionaries;
import java.util.*;

public class sad_7 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, String> words_string= new HashMap<>();
        for (int i = 0; i < n; i++){
            String q = sc.next();
            q = q.substring(0, q.length()-1);
            words_string.put(q, sc.nextLine().toLowerCase(Locale.ROOT));
        }
        int q1 = sc.nextInt();
        for (Map.Entry<String, String> item : words_string.entrySet()){
            String [] mass = item.getValue().split(" ");
            HashSet<String> text_str = new HashSet<>();
            for (String w : mass){
                if (w.length()>=q1){
                    text_str.add(w);
                }
            }
            item.setValue(String.valueOf(text_str.size()));
        }
        int count = -1;
        String name = "";
        for (Map.Entry<String, String> item : words_string.entrySet()) {
            if (Integer.parseInt(item.getValue()) > count){
                count = Integer.parseInt(item.getValue());
                name = item.getKey();
            }
        }
        System.out.println(name + " " + count);
    }
}
