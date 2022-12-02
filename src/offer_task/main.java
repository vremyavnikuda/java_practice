package offer_task;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[]args){
        Point p1=new Point(1,2);
        Point p2=new Point(1,2);
        Point p3=new Point(2022,2023);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        Set<Point>set=new HashSet<>();
        set.add(p1);

        System.out.println(set.contains(p2));
        System.out.println(set.contains(p3));
    }
}
