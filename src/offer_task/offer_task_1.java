package offer_task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class offer_task_1 {
    public static void main (String[]args){
        List<String> list = new ArrayList();
        list.add("Java");
        list.add("advent");

        Stream str = list.stream();
        list.remove(0);

        System.out.println(str.count());
    }
}
